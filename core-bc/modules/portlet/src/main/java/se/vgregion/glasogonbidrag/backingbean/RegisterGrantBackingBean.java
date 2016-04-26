package se.vgregion.glasogonbidrag.backingbean;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import se.vgregion.glasogonbidrag.util.GrantUtil;
import se.vgregion.glasogonbidrag.vo.GrantVO;
import se.vgregion.glasogonbidrag.vo.IssuedGrantVO;
import se.vgregion.glasogonbidrag.vo.PersonVO;

import javax.annotation.PostConstruct;
import javax.faces.event.AjaxBehaviorEvent;
import java.util.ArrayList;
import java.util.List;

@Component(value = "registerGrantBackingBean")
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class RegisterGrantBackingBean {

    private GrantVO grant;
    private PersonVO person;
    private List<IssuedGrantVO> issuedGrants;

    @PostConstruct
    public void init() {

        System.out.println("RegisterGrantBackingBean - init");

        grant = new GrantVO();
        person = null;
        issuedGrants = new ArrayList<IssuedGrantVO>();
    }

    public void personNumberChange() {

        person = GrantUtil.getPerson(grant.getPersonNumber());
        issuedGrants = GrantUtil.getIssuedGrants(person.getPersonNumber());
    }

    public final void grantTypeChange(final AjaxBehaviorEvent event){
        System.out.println("RegisterGrantBackingBean - grantTypeChange");
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
}