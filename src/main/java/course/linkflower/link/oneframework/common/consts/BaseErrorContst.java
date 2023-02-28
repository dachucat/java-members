package course.linkflower.link.oneframework.common.consts;

public class BaseErrorContst {
    public final static int BaseErrorBase = 0;
    public final static int BaseErrorTimeFormatError = BaseErrorBase + 1;
    public final static String BaseMsgTimeFormatError = "时间格式错误";


    public final static int BaseErrorTimeParamError = BaseErrorBase + 2;
    public final static String BaseMsgTimeParamsError = "参数错误:%s";

    public final static int BaseErrorTimeParamDuplicateError = BaseErrorBase + 3;
    public final static String BaseMsgTimeParamsDuplicateError = "参数重复错误:%s";

    public final static int BaseErrorTimeParamMaxError = BaseErrorBase + 3;
    public final static String BaseMsgTimeParamsMaxError = "%参数不能大于:%s";



}
