//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.5-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.05.01 at 05:38:23 PM WEST 
//


package org.openxdm.xcap.client.appusage.presrules.jaxb.commonpolicy;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.openxdm.xcap.client.appusage.presrules.jaxb.commonpolicy package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _IdentityTypeOne_QNAME = new QName("urn:ietf:params:xml:ns:common-policy", "one");
    private final static QName _IdentityTypeMany_QNAME = new QName("urn:ietf:params:xml:ns:common-policy", "many");
    private final static QName _ManyTypeExcept_QNAME = new QName("urn:ietf:params:xml:ns:common-policy", "except");
    private final static QName _ValidityTypeUntil_QNAME = new QName("urn:ietf:params:xml:ns:common-policy", "until");
    private final static QName _ValidityTypeFrom_QNAME = new QName("urn:ietf:params:xml:ns:common-policy", "from");
    private final static QName _ConditionsTypeIdentity_QNAME = new QName("urn:ietf:params:xml:ns:common-policy", "identity");
    private final static QName _ConditionsTypeValidity_QNAME = new QName("urn:ietf:params:xml:ns:common-policy", "validity");
    private final static QName _ConditionsTypeSphere_QNAME = new QName("urn:ietf:params:xml:ns:common-policy", "sphere");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.openxdm.xcap.client.appusage.presrules.jaxb.commonpolicy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Ruleset }
     * 
     */
    public Ruleset createRuleset() {
        return new Ruleset();
    }

    /**
     * Create an instance of {@link ActionsType }
     * 
     */
    public ActionsType createActionsType() {
        return new ActionsType();
    }

    /**
     * Create an instance of {@link TransformationsType }
     * 
     */
    public TransformationsType createTransformationsType() {
        return new TransformationsType();
    }
    
    /**
     * Create an instance of {@link ExtensibleType }
     * 
     */
    public ExtensibleType createExtensibleType() {
        return new ExtensibleType();
    }
    
    /**
     * Create an instance of {@link SphereType }
     * 
     */
    public SphereType createSphereType() {
        return new SphereType();
    }

    /**
     * Create an instance of {@link ManyType }
     * 
     */
    public ManyType createManyType() {
        return new ManyType();
    }

    /**
     * Create an instance of {@link IdentityType }
     * 
     */
    public IdentityType createIdentityType() {
        return new IdentityType();
    }

    /**
     * Create an instance of {@link ExceptType }
     * 
     */
    public ExceptType createExceptType() {
        return new ExceptType();
    }

    /**
     * Create an instance of {@link RuleType }
     * 
     */
    public RuleType createRuleType() {
        return new RuleType();
    }

    /**
     * Create an instance of {@link ValidityType }
     * 
     */
    public ValidityType createValidityType() {
        return new ValidityType();
    }

    /**
     * Create an instance of {@link OneType }
     * 
     */
    public OneType createOneType() {
        return new OneType();
    }

    /**
     * Create an instance of {@link ConditionsType }
     * 
     */
    public ConditionsType createConditionsType() {
        return new ConditionsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OneType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ietf:params:xml:ns:common-policy", name = "one", scope = IdentityType.class)
    public JAXBElement<OneType> createIdentityTypeOne(OneType value) {
        return new JAXBElement<OneType>(_IdentityTypeOne_QNAME, OneType.class, IdentityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ietf:params:xml:ns:common-policy", name = "many", scope = IdentityType.class)
    public JAXBElement<ManyType> createIdentityTypeMany(ManyType value) {
        return new JAXBElement<ManyType>(_IdentityTypeMany_QNAME, ManyType.class, IdentityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ietf:params:xml:ns:common-policy", name = "except", scope = ManyType.class)
    public JAXBElement<ExceptType> createManyTypeExcept(ExceptType value) {
        return new JAXBElement<ExceptType>(_ManyTypeExcept_QNAME, ExceptType.class, ManyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ietf:params:xml:ns:common-policy", name = "until", scope = ValidityType.class)
    public JAXBElement<XMLGregorianCalendar> createValidityTypeUntil(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ValidityTypeUntil_QNAME, XMLGregorianCalendar.class, ValidityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ietf:params:xml:ns:common-policy", name = "from", scope = ValidityType.class)
    public JAXBElement<XMLGregorianCalendar> createValidityTypeFrom(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ValidityTypeFrom_QNAME, XMLGregorianCalendar.class, ValidityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ietf:params:xml:ns:common-policy", name = "identity", scope = ConditionsType.class)
    public JAXBElement<IdentityType> createConditionsTypeIdentity(IdentityType value) {
        return new JAXBElement<IdentityType>(_ConditionsTypeIdentity_QNAME, IdentityType.class, ConditionsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ietf:params:xml:ns:common-policy", name = "validity", scope = ConditionsType.class)
    public JAXBElement<ValidityType> createConditionsTypeValidity(ValidityType value) {
        return new JAXBElement<ValidityType>(_ConditionsTypeValidity_QNAME, ValidityType.class, ConditionsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SphereType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ietf:params:xml:ns:common-policy", name = "sphere", scope = ConditionsType.class)
    public JAXBElement<SphereType> createConditionsTypeSphere(SphereType value) {
        return new JAXBElement<SphereType>(_ConditionsTypeSphere_QNAME, SphereType.class, ConditionsType.class, value);
    }

}