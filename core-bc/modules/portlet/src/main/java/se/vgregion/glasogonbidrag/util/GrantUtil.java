package se.vgregion.glasogonbidrag.util;

import se.vgregion.glasogonbidrag.vo.IssuedGrantVO;
import se.vgregion.glasogonbidrag.vo.PersonVO;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class GrantUtil {

    public static List<IssuedGrantVO> getIssuedGrants(String personNumber) {
        return createDummyIssuedGrants(personNumber);
    }

    public static PersonVO getPerson(String personNumber) {
        return createDummyPerson(personNumber);
    }


    // Private methods

    private static List<IssuedGrantVO> createDummyIssuedGrants(String personNumber) {

        ArrayList<IssuedGrantVO> issuedGrants = new ArrayList<IssuedGrantVO>();

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(0);
        calendar.set(2016, 03, 20, 12, 20, 0);
        Date date1 = calendar.getTime();
        calendar.set(2016, 03, 21, 12, 20, 0);
        Date date2 = calendar.getTime();

        String voucherNumber_1 = "E2345678";
        double amountExcludingVAT_1 = 500;
        Date prescriptionDate_1 = date1;
        Date receiptDate_1 = date2;
        String status_1 = "Betalad";
        IssuedGrantVO IssuedGrant_1 = new IssuedGrantVO(voucherNumber_1, amountExcludingVAT_1, prescriptionDate_1, receiptDate_1, status_1);

        String voucherNumber_2 = "E3456789";
        double amountExcludingVAT_2 = 500;
        Date prescriptionDate_2 = date1;
        Date receiptDate_2 = date2;
        String status_2 = "Betalad";
        IssuedGrantVO IssuedGrant_2 = new IssuedGrantVO(voucherNumber_2, amountExcludingVAT_2, prescriptionDate_2, receiptDate_2, status_2);

        issuedGrants.add(IssuedGrant_1);
        issuedGrants.add(IssuedGrant_2);

        return issuedGrants;
    }

    private static PersonVO createDummyPerson(String personNumber) {
        String firstName = "Anders";
        String lastName = "Andersson";
        String streetAdress = "Andersgatan 1";
        String zipCode = "123 45";
        String city = "Anderstaden";


        PersonVO person = new PersonVO(firstName, lastName, personNumber, streetAdress, zipCode, city);

        return person;
    }


}
