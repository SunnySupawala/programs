package com.in.customdatastructure;

public interface ErrorCodes {

    public String CHECK_PAST_DATE = " Policy Start Date cannot be a Past Date. ";
    public String PRE_POLICY_END_DATE_45_DAYS = "P re Policy End Date should be greater than today's date by 45 Days. ";
    public String PRE_POLICY_START_DATE_AND_END_DATE_VALIDATION = " Policy Start Date should be greater than PrePolicy End " +
            "Date by 1 or more day for 'New Vehicle', " +
            "Policy Start Date cannot be less than PrePolicy End Date by 1 day for 'New Vehicle'. ";
    public String MANUFACTURE_DATE_AND_REG_DATE_VALIDATE_2_YEARS = " Year of Manufacture should be less than or equal to the Purchase Regn Date by 2 years. ";
    public String NEW_VEHICLE_REGN_DATE_6_MONTH_VALIDATION = " Purchase Regn Date should be T-6 months to T (T = Current Date) for 'New Vehicle', " +
            "Policy Start Date cannot be greater than Purchase Regn Date by 6 months for 'New Vehicle'”  new Vehicle date range previous 6 month. ";
    public String PURCHASE_REGN_DATE_FUTURE_VALIDATION = " Purchase Regn Date cannot be a Future Date. ";
    public String YEAR_OF_MANUFACTURE_AND_PRE_POLICY_START_DATE_LESS_VALIDATE = " Year of Manufacture should be less than the PrePolicy Start Date. ";

    String NO_QUOTE_FOUND_ERROR_MSG="No Quote found matching for request criteria.";
    String COULD_NOT_FETCH_QUOTE_REASON="Could not fetch Quote. Reason : ";

    String NO_MOTOR_POLICY_XML_FOUND="Motor Policy Object could not be blank.";

    String NULL_IDV_RESPONSE="idv response object is Null";

    String VEHICLE_BLACK_LISTED = "Vehicle Make and Model is BlackListed";

    String CORECT_DISCOUNT_ON_THE_PREVIOUS_POLICY = "PLEASE ENTER CORRECT DISCOUNT ON THE PREVIOUS POLICY";

    String STANDALONE_EXCEPTION = "APOLOGIES! WE WON¿T BE ABLE TO OFFER YOU A STANDALONE OWN DAMAGE POLICY";

    String STANDALONE_EXCEPTION_MESSAGE = "Apologies ! We wont be able to offer you a standalone own damage policy";

    String COULD_NOT_FETCH =  "Could not fetch Quote. Reason : UNKNOWN ERROR, PLEASE CONTACT WITH COMPANYREPRESENTATIVE";

    String ERROR_FETCHING_MSG = "Could not fetch Quote.";

    String MODEL_NOT_AVAILABLE ="The Selected model is not available";

    String DEFAULT_MSG = "Sorry! we are unable to generate quotes at this moment.";

    String HDFC_INSURER_ID = "HDFC_ERGO";



    String EXCEPTION_IN_CALLING_PRC_GST_TAX_SPLIT = "EXCEPTION OCCURRED WHILE CALLING PRC_GSTTAXSPLIT";

    String CASE_CANNOT_BE_PROCESSED = "Case cannot be processed online.";
}
