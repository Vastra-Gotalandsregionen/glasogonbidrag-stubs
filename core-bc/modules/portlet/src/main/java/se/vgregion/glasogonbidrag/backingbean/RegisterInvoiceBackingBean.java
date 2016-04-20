package se.vgregion.glasogonbidrag.backingbean;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.Layout;
import com.liferay.portal.service.LayoutLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import java.io.IOException;

@ManagedBean
public class RegisterInvoiceBackingBean {

    @PostConstruct
    public void init() {

    }

    public void cancelInvoiceRegistration() {
        System.out.println("RegisterInvoiceBackingBean - cancelInvoiceRegistration");

        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        ThemeDisplay themeDisplay = (ThemeDisplay)externalContext.getRequestMap().get(WebKeys.THEME_DISPLAY);

        Group scopeGroup = themeDisplay.getScopeGroup();

        try {
            boolean privateLayout = true;

            String groupFriendlyURL = PortalUtil.getGroupFriendlyURL(
                    themeDisplay.getScopeGroup(), privateLayout, themeDisplay, themeDisplay.getLocale());

            externalContext.redirect(groupFriendlyURL);

        } catch (PortalException e) {
            e.printStackTrace();
        } catch (SystemException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public String submitInvoiceRegistration() {

        System.out.println("RegisterInvoiceBackingBean - submitInvoiceRegistration");

        return "invoice_overview";
    }




}