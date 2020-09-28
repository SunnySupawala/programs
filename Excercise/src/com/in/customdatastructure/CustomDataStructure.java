package com.in.customdatastructure;

import java.util.*;

public class CustomDataStructure {

    public static void main(String[] args) {
        System.out.println(getErrorMsg("APOLOGIES! WE WON¿T BE ABLE TO OFFER YOU A STANDALONE OWN DAMAGE POLICY"));

    }

    public static String getErrorMsg(String errorMsg)
    {
        if (errorMsg.contains(ErrorCodes.VEHICLE_BLACK_LISTED) || errorMsg.contains(ErrorCodes.CORECT_DISCOUNT_ON_THE_PREVIOUS_POLICY)
                || errorMsg.contains(ErrorCodes.MODEL_NOT_AVAILABLE)) {
            return errorMsg;
        } else if (errorMsg.contains(ErrorCodes.EXCEPTION_IN_CALLING_PRC_GST_TAX_SPLIT)) {
            return ErrorCodes.CASE_CANNOT_BE_PROCESSED;
        } else if(errorMsg.contains(ErrorCodes.STANDALONE_EXCEPTION)){
            return ErrorCodes.STANDALONE_EXCEPTION_MESSAGE;
        } else if (errorMsg.contains(ErrorCodes.COULD_NOT_FETCH)) {
            return ErrorCodes.ERROR_FETCHING_MSG;
        }else {
            return ErrorCodes.DEFAULT_MSG;
        }
    }
}
