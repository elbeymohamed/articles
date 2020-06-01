
package org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import org.datacontract.schemas._2004._07.ajoutarticlewcfservice.Article;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IService1", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    com.microsoft.schemas._2003._10.serialization.ObjectFactory.class,
    org.datacontract.schemas._2004._07.ajoutarticlewcfservice.ObjectFactory.class,
    org.tempuri.ObjectFactory.class
})
public interface IService1 {


    /**
     * 
     * @param article
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod(action = "http://tempuri.org/IService1/setArticle")
    @WebResult(name = "setArticleResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "setArticle", targetNamespace = "http://tempuri.org/", className = "org.tempuri.SetArticle")
    @ResponseWrapper(localName = "setArticleResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.SetArticleResponse")
    public Integer setArticle(
        @WebParam(name = "article", targetNamespace = "http://tempuri.org/")
        Article article);

}