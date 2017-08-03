package com.gamecenter.alipay.internal.parser.xml;

import com.gamecenter.alipay.AlipayApiException;
import com.gamecenter.alipay.AlipayParser;
import com.gamecenter.alipay.AlipayRequest;
import com.gamecenter.alipay.AlipayResponse;
import com.gamecenter.alipay.SignItem;
import com.gamecenter.alipay.internal.mapping.Converter;
import com.gamecenter.alipay.internal.mapping.Converters;

/**
 * 单个JSON对象解释器。
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ObjectXmlParser<T extends AlipayResponse> implements AlipayParser<T> {

    private Class<T> clazz;

    public ObjectXmlParser(Class<T> clazz) {
        this.clazz = clazz;
    }

    public T parse(String rsp) throws AlipayApiException {
        Converter converter = new XmlConverter();
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

        Converter converter = new XmlConverter();

        return converter.getSignItem(request, responseBody);
    }

    /** 
     * @see com.gamecenter.alipay.AlipayParser#encryptSourceData(com.gamecenter.alipay.AlipayRequest, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
    public String encryptSourceData(AlipayRequest<?> request, String body, String format,
                                       String encryptType, String encryptKey, String charset)
                                                                                             throws AlipayApiException {

        Converter converter = new XmlConverter();

        return converter.encryptSourceData(request, body, format, encryptType, encryptKey,
            charset);
    }

}
