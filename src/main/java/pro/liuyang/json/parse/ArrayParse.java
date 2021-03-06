package pro.liuyang.json.parse;

import pro.liuyang.json.constants.CommonConstant;

/**
 * 解析数组
 * @author Yang.Liu
 * @version 1.0
 * 2020-07-28
 */
public class ArrayParse {

    private ArrayParse() {}

    public static void parse(StringBuilder sb, Object... objects) throws IllegalAccessException {
        int len = objects.length;
        sb.append(CommonConstant.LEFT_PARENTHESES_ARR);
        for (int i = 0; i < len; i++) {
            Object obj = objects[i];
            TypeTransfer.transfer(obj, sb, null);
            if (i < len - 1) {
                sb.append(CommonConstant.COMMA);
            }
        }
        sb.append(CommonConstant.RIGHT_PARENTHESES_ARR);
    }

}
