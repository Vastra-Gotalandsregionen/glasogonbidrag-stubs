package se.vgregion.glasogonbidrag.backingbean;

import com.liferay.faces.portal.context.LiferayFacesContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import se.vgregion.glasogonbidrag.util.GrantUtil;
import se.vgregion.glasogonbidrag.vo.GrantVO;
import se.vgregion.glasogonbidrag.vo.IssuedGrantVO;
import se.vgregion.glasogonbidrag.vo.PersonVO;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component(value = "registerGrantBackingBean")
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class RegisterGrantBackingBean {

    private int tabIndexActive;
    private GrantVO grant;
    private PersonVO person;
    private List<IssuedGrantVO> issuedGrants;
    private String portletNamespace;

    @PostConstruct
    public void init() {

        System.out.println("RegisterGrantBackingBean - init");

        portletNamespace = FacesContext.getCurrentInstance().getExternalContext().encodeNamespace("");
        grant = new GrantVO();
        person = null;
        issuedGrants = new ArrayList<IssuedGrantVO>();

        tabIndexActive = 0;

    }


    public void tabsListener(int tabIndexNew){
        System.out.println("RegisterGrantBackingBean - tabsListener");

        tabIndexActive = tabIndexNew;
    }



    public void personNumberListener() {

        System.out.println("RegisterGrantBackingBean - personNumberListener");

        if(!(grant.getPersonNumber().equals(""))) {
            person = GrantUtil.getPerson(grant.getPersonNumber());
            issuedGrants = GrantUtil.getIssuedGrants(person.getPersonNumber());
        }

    }

    public void grantTypeListener(){
        System.out.println("RegisterGrantBackingBean - grantTypeListener");
    }


    public GrantVO getGrant() {
        return grant;
    }

    public void setGrant(GrantVO grant) {
        this.grant = grant;
    }

    public PersonVO getPerson() {
        return person;
    }

    public void setPerson(PersonVO person) {
        this.person = person;
    }

    public List<IssuedGrantVO> getIssuedGrants() {
        return issuedGrants;
    }

    public void setIssuedGrants(List<IssuedGrantVO> issuedGrants) {
        this.issuedGrants = issuedGrants;
    }

    public int getTabIndexActive() {
        return tabIndexActive;
    }

    public void setTabIndexActive(int tabIndexActive) {
        this.tabIndexActive = tabIndexActive;
    }

    public String getPortletNamespace() {
        return portletNamespace;
    }

    public void setPortletNamespace(String portletNamespace) {
        this.portletNamespace = portletNamespace;
    }
}