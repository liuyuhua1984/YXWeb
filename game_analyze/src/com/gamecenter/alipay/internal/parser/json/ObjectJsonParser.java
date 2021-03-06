package com.gamecenter.alipay.internal.parser.json;

import com.gamecenter.alipay.AlipayApiException;
import com.gamecenter.alipay.AlipayParser;
import com.gamecenter.alipay.AlipayRequest;
import com.gamecenter.alipay.AlipayResponse;
import com.gamecenter.alipay.SignItem;
import com.gamecenter.alipay.internal.mapping.Converter;
/**
 * 单个JSON对象解释器。
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ObjectJsonParser<T extends AlipayResponse> implements AlipayParser<T> {

    private Class<T> clazz;

    public ObjectJsonParser(Class<T> clazz) {
        this.clazz = clazz;
    }

    public T parse(String rsp) throws AlipayApiException {
        Converter converter = new JsonConverter();
        return converter.toResponse(rsp, clazz);
    }

    public Class<T> getResponseClass() {
        return clazz;
    }

    /** 
     * @see com.gamecenter.alipay.AlipayParser#getSignItem(com.gamecenter.alipay.AlipayRequest, String)
     */
    public SignItem getSignItem(AlipayRequest<?> request, String responseBody)
                                                                              throws AlipayApiException {

        Converter converter = new JsonConverter();

        return converter.getSignItem(request, responseBody);
    }

    /** 
     * @see com.gamecenter.alipay.AlipayParser#encryptSourceData(com.gamecenter.alipay.AlipayRequest, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
    public String encryptSourceData(AlipayRequest<?> request, String body, String format,
                                       String encryptType, String encryptKey, String charset)
                                                                                             throws AlipayApiException {

        Converter converter = new JsonConverter();

        return converter.encryptSourceData(request, body, format, encryptType, encryptKey,
            charset);
    }

}
