package org.xmlet.htmlapi;

import java.math.BigInteger;

public class Textarea<Z extends Element> extends AbstractElement<Textarea<Z>, Z> implements CommonAttributeGroup<Textarea<Z>, Z>, TextGroup<Textarea<Z>, Z> {
   public Textarea() {
      super("textarea");
   }

   public Textarea(String name) {
      super(name);
   }

   public Textarea(Z parent) {
      super(parent, "textarea");
   }

   public Textarea(Z parent, String name) {
      super(parent, name);
   }

   public Textarea<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Textarea<Z> cloneElem() {
      return (Textarea)this.clone(new Textarea());
   }

   public Textarea<Z> attrAutofocus(EnumAutofocusTextarea attrAutofocus) {
      return (Textarea)this.addAttr(new AttrAutofocusEnumAutofocusTextarea(attrAutofocus));
   }

   public Textarea<Z> attrDisabled(EnumDisabledTextarea attrDisabled) {
      return (Textarea)this.addAttr(new AttrDisabledEnumDisabledTextarea(attrDisabled));
   }

   public Textarea<Z> attrForm(java.lang.Object attrForm) {
      return (Textarea)this.addAttr(new AttrFormObject(attrForm));
   }

   public Textarea<Z> attrMaxlength(java.lang.Object attrMaxlength) {
      return (Textarea)this.addAttr(new AttrMaxlengthObject(attrMaxlength));
   }

   public Textarea<Z> attrName(java.lang.Object attrName) {
      return (Textarea)this.addAttr(new AttrNameObject(attrName));
   }

   public Textarea<Z> attrPlaceholder(java.lang.Object attrPlaceholder) {
      return (Textarea)this.addAttr(new AttrPlaceholderObject(attrPlaceholder));
   }

   public Textarea<Z> attrReadonly(EnumReadonlyTextarea attrReadonly) {
      return (Textarea)this.addAttr(new AttrReadonlyEnumReadonlyTextarea(attrReadonly));
   }

   public Textarea<Z> attrRequired(EnumRequiredTextarea attrRequired) {
      return (Textarea)this.addAttr(new AttrRequiredEnumRequiredTextarea(attrRequired));
   }

   public Textarea<Z> attrRows(BigInteger attrRows) {
      return (Textarea)this.addAttr(new AttrRowsBigInteger(attrRows));
   }

   public Textarea<Z> attrCols(BigInteger attrCols) {
      return (Textarea)this.addAttr(new AttrColsBigInteger(attrCols));
   }

   public Textarea<Z> attrWrap(EnumWrapTextarea attrWrap) {
      return (Textarea)this.addAttr(new AttrWrapEnumWrapTextarea(attrWrap));
   }
}
