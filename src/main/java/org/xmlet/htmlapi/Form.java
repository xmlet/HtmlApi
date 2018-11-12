package org.xmlet.htmlapi;

public class Form<Z extends Element> extends AbstractElement<Form<Z>, Z> implements CommonAttributeGroup<Form<Z>, Z>, FlowContentChoice<Form<Z>, Z> {
   public Form() {
      super("form");
   }

   public Form(String name) {
      super(name);
   }

   public Form(Z parent) {
      super(parent, "form");
   }

   public Form(Z parent, String name) {
      super(parent, name);
   }

   public Form<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Form<Z> cloneElem() {
      return (Form)this.clone(new Form());
   }

   public Form<Z> attrAcceptCharset(java.lang.Object attrAcceptCharset) {
      return (Form)this.addAttr(new AttrAcceptCharsetObject(attrAcceptCharset));
   }

   public Form<Z> attrAction(String attrAction) {
      return (Form)this.addAttr(new AttrActionString(attrAction));
   }

   public Form<Z> attrAutocomplete(EnumAutocompleteForm attrAutocomplete) {
      return (Form)this.addAttr(new AttrAutocompleteEnumAutocompleteForm(attrAutocomplete));
   }

   public Form<Z> attrEnctype(EnumEnctypeForm attrEnctype) {
      return (Form)this.addAttr(new AttrEnctypeEnumEnctypeForm(attrEnctype));
   }

   public Form<Z> attrMethod(EnumMethodForm attrMethod) {
      return (Form)this.addAttr(new AttrMethodEnumMethodForm(attrMethod));
   }

   public Form<Z> attrName(java.lang.Object attrName) {
      return (Form)this.addAttr(new AttrNameObject(attrName));
   }

   public Form<Z> attrNovalidate(EnumNovalidateForm attrNovalidate) {
      return (Form)this.addAttr(new AttrNovalidateEnumNovalidateForm(attrNovalidate));
   }

   public Form<Z> attrTarget(EnumTargetBrowsingContext attrTarget) {
      return (Form)this.addAttr(new AttrTargetEnumTargetBrowsingContext(attrTarget));
   }
}
