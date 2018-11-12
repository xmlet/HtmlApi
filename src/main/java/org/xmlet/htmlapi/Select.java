package org.xmlet.htmlapi;

public class Select<Z extends Element> extends AbstractElement<Select<Z>, Z> implements CommonAttributeGroup<Select<Z>, Z>, SelectChoice0<Select<Z>, Z> {
   public Select() {
      super("select");
   }

   public Select(String name) {
      super(name);
   }

   public Select(Z parent) {
      super(parent, "select");
   }

   public Select(Z parent, String name) {
      super(parent, name);
   }

   public Select<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Select<Z> cloneElem() {
      return (Select)this.clone(new Select());
   }

   public Select<Z> attrAutofocus(EnumAutofocusSelect attrAutofocus) {
      return (Select)this.addAttr(new AttrAutofocusEnumAutofocusSelect(attrAutofocus));
   }

   public Select<Z> attrDisabled(EnumDisabledSelect attrDisabled) {
      return (Select)this.addAttr(new AttrDisabledEnumDisabledSelect(attrDisabled));
   }

   public Select<Z> attrForm(java.lang.Object attrForm) {
      return (Select)this.addAttr(new AttrFormObject(attrForm));
   }

   public Select<Z> attrMultiple(EnumMultipleSelect attrMultiple) {
      return (Select)this.addAttr(new AttrMultipleEnumMultipleSelect(attrMultiple));
   }

   public Select<Z> attrName(java.lang.Object attrName) {
      return (Select)this.addAttr(new AttrNameObject(attrName));
   }

   public Select<Z> attrSize(java.lang.Object attrSize) {
      return (Select)this.addAttr(new AttrSizeObject(attrSize));
   }
}
