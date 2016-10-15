package scijoker.npsdk.response;

import scijoker.npsdk.response.bean.ErrorCode;
import scijoker.npsdk.response.bean.Info;
import scijoker.npsdk.response.bean.InfoCode;
import scijoker.npsdk.response.bean.MessageCode;
import scijoker.npsdk.response.bean.Warning;
import scijoker.npsdk.response.bean.WarningCode;

/**
 * Created by scijoker on 15.10.16.
 */

public class Base_ResponseObj {
    public boolean success;
    public Error[] errors;
    public Warning[] warnings;
    public Info[] info;
    public MessageCode[] messageCodes;
    public ErrorCode[] errorCodes;
    public WarningCode[] warningCodes;
    public InfoCode[] infoCodes;
}
