package org.xmlet.htmlapi;

public class Button<Z extends Element> extends AbstractElement<Button<Z>, Z> implements CommonAttributeGroup<Button<Z>, Z>, ButtonServerAttributeGroup<Button<Z>, Z>, PhrasingContentChoice<Button<Z>, Z> {
   public Button() {
      super("button");
   }

   public Button(String name) {
      super(name);
   }

   public Button(Z parent) {
      super(parent, "button");
   }

   public Button(Z parent, String name) {
      super(parent, name);
   }

   public Button<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Button<Z> cloneElem() {
      return (Button)this.clone(new Button());
   }

   public Button<Z> attrAutofocus(EnumAutofocusButton attrAutofocus) {
      return (Button)this.addAttr(new AttrAutofocusEnumAutofocusButton(attrAutofocus));
   }

   public Button<Z> attrDisabled(EnumDisabledButton attrDisabled) {
      return (Button)this.addAttr(new AttrDisabledEnumDisabledButton(attrDisabled));
   }

   public Button<Z> attrForm(java.lang.Object attrForm) {
      return (Button)this.addAttr(new AttrFormObject(attrForm));
   }

   public Button<Z> attrFormaction(java.lang.Object attrFormaction) {
      return (Button)this.addAttr(new AttrFormactionObject(attrFormaction));
   }

   public Button<Z> attrFormenctype(EnumFormenctypeButton attrFormenctype) {
      return (Button)this.addAttr(new AttrFormenctypeEnumFormenctypeButton(attrFormenctype));
   }

   public Button<Z> attrFormmethod(EnumFormmethodButton attrFormmethod) {
      return (Button)this.addAttr(new AttrFormmethodEnumFormmethodButton(attrFormmethod));
   }

   public Button<Z> attrFormnovalidate(EnumFormnovalidateButton attrFormnovalidate) {
      return (Button)this.addAttr(new AttrFormnovalidateEnumFormnovalidateButton(attrFormnovalidate));
   }

   public Button<Z> attrFormtarget(EnumFormtargetBrowsingContext attrFormtarget) {
      return (Button)this.addAttr(new AttrFormtargetEnumFormtargetBrowsingContext(attrFormtarget));
   }

   public Button<Z> attrName(java.lang.Object attrName) {
      return (Button)this.addAttr(new AttrNameObject(attrName));
   }

   public Button<Z> attrValue(java.lang.Object attrValue) {
      return (Button)this.addAttr(new AttrValueObject(attrValue));
   }

   public Button<Z> attrType(EnumTypeButton attrType) {
      return (Button)this.addAttr(new AttrTypeEnumTypeButton(attrType));
   }
}
