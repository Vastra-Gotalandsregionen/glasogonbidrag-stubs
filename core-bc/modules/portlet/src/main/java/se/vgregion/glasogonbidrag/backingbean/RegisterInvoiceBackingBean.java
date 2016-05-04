package se.vgregion.glasogonbidrag.backingbean;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Group;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import java.io.IOException;

@Component(value = "registerInvoiceBackingBean")
@Scope(value="request", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class RegisterInvoiceBackingBean {

    @Autowired
    private RegisterGrantBackingBean registerGrantBackingBean;

    @PostConstruct
    public void init() {
        _log.warn("POSTCONST - submitInvoiceRegistration log!");
    }

    public void cancelInvoiceRegistration() {
        System.out.println("RegisterInvoiceBackingBean - cancelInvoiceRegistration");

        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        ThemeDisplay themeDisplay = (ThemeDisplay)externalContext.getRequestMap().get(WebKeys.THEME_DISPLAY);

//        Group scopeGroup = themeDisplay.getScopeGroup();

        try {
//            boolean privateLayout = true;

            String groupFriendlyURL = PortalUtil.getGroupFriendlyURL(
                    themeDisplay.getScopeGroup(), true, themeDisplay, themeDisplay.getLocale());

            externalContext.redirect(groupFriendlyURL);

        } catch (PortalException|SystemException|IOException e) {
            e.printStackTrace();
        }
    }

    public String submitInvoiceRegistration() {
        _log.warn("RegisterInvoiceBackingBean - submitInvoiceRegistration log!");

        System.out.println("RegisterInvoiceBackingBean - submitInvoiceRegistration");

        registerGrantBackingBean.init();

        return "add_grant?faces-redirect=true&amp;includeViewParams=true";
    }



    private static final Log _log =
            LogFactoryUtil.getLog(RegisterInvoiceBackingBean.class);


}