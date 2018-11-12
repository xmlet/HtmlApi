package org.xmlet.htmlapi;

public class Keygen<Z extends Element> extends AbstractElement<Keygen<Z>, Z> implements CommonAttributeGroup<Keygen<Z>, Z>, TextGroup<Keygen<Z>, Z> {
   public Keygen() {
      super("keygen");
   }

   public Keygen(String name) {
      super(name);
   }

   public Keygen(Z parent) {
      super(parent, "keygen");
   }

   public Keygen(Z parent, String name) {
      super(parent, name);
   }

   public Keygen<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Keygen<Z> cloneElem() {
      return (Keygen)this.clone(new Keygen());
   }

   public Keygen<Z> attrAutofocus(EnumAutofocusKeygen attrAutofocus) {
      return (Keygen)this.addAttr(new AttrAutofocusEnumAutofocusKeygen(attrAutofocus));
   }

   public Keygen<Z> attrChallenge(java.lang.Object attrChallenge) {
      return (Keygen)this.addAttr(new AttrChallengeObject(attrChallenge));
   }

   public Keygen<Z> attrDisabled(EnumDisabledKeygen attrDisabled) {
      return (Keygen)this.addAttr(new AttrDisabledEnumDisabledKeygen(attrDisabled));
   }

   public Keygen<Z> attrForm(java.lang.Object attrForm) {
      return (Keygen)this.addAttr(new AttrFormObject(attrForm));
   }

   public Keygen<Z> attrKeytype(EnumKeytypeKeygen attrKeytype) {
      return (Keygen)this.addAttr(new AttrKeytypeEnumKeytypeKeygen(attrKeytype));
   }

   public Keygen<Z> attrName(java.lang.Object attrName) {
      return (Keygen)this.addAttr(new AttrNameObject(attrName));
   }
}
