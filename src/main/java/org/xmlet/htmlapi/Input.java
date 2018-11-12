package org.xmlet.htmlapi;

public class Input<Z extends Element> extends AbstractElement<Input<Z>, Z> implements CommonAttributeGroup<Input<Z>, Z>, TextGroup<Input<Z>, Z> {
   public Input() {
      super("input");
   }

   public Input(String name) {
      super(name);
   }

   public Input(Z parent) {
      super(parent, "input");
   }

   public Input(Z parent, String name) {
      super(parent, name);
   }

   public Input<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Input<Z> cloneElem() {
      return (Input)this.clone(new Input());
   }

   public Input<Z> attrType(EnumTypeInput attrType) {
      return (Input)this.addAttr(new AttrTypeEnumTypeInput(attrType));
   }

   public Input<Z> attrAccept(java.lang.Object attrAccept) {
      return (Input)this.addAttr(new AttrAcceptObject(attrAccept));
   }

   public Input<Z> attrAlt(java.lang.Object attrAlt) {
      return (Input)this.addAttr(new AttrAltObject(attrAlt));
   }

   public Input<Z> attrAutocomplete(java.lang.Object attrAutocomplete) {
      return (Input)this.addAttr(new AttrAutocompleteObject(attrAutocomplete));
   }

   public Input<Z> attrChecked(EnumCheckedInput attrChecked) {
      return (Input)this.addAttr(new AttrCheckedEnumCheckedInput(attrChecked));
   }

   public Input<Z> attrDisabled(EnumDisabledInput attrDisabled) {
      return (Input)this.addAttr(new AttrDisabledEnumDisabledInput(attrDisabled));
   }

   public Input<Z> attrForm(java.lang.Object attrForm) {
      return (Input)this.addAttr(new AttrFormObject(attrForm));
   }

   public Input<Z> attrFormaction(java.lang.Object attrFormaction) {
      return (Input)this.addAttr(new AttrFormactionObject(attrFormaction));
   }

   public Input<Z> attrFormenctype(EnumFormenctypeInput attrFormenctype) {
      return (Input)this.addAttr(new AttrFormenctypeEnumFormenctypeInput(attrFormenctype));
   }

   public Input<Z> attrFormmethod(EnumFormmethodInput attrFormmethod) {
      return (Input)this.addAttr(new AttrFormmethodEnumFormmethodInput(attrFormmethod));
   }

   public Input<Z> attrFormnovalidate(EnumFormnovalidateInput attrFormnovalidate) {
      return (Input)this.addAttr(new AttrFormnovalidateEnumFormnovalidateInput(attrFormnovalidate));
   }

   public Input<Z> attrFormtarget(EnumFormtargetBrowsingContext attrFormtarget) {
      return (Input)this.addAttr(new AttrFormtargetEnumFormtargetBrowsingContext(attrFormtarget));
   }

   public Input<Z> attrHeight(java.lang.Object attrHeight) {
      return (Input)this.addAttr(new AttrHeightObject(attrHeight));
   }

   public Input<Z> attrList(java.lang.Object attrList) {
      return (Input)this.addAttr(new AttrListObject(attrList));
   }

   public Input<Z> attrMax(java.lang.Object attrMax) {
      return (Input)this.addAttr(new AttrMaxObject(attrMax));
   }

   public Input<Z> attrMaxlength(java.lang.Object attrMaxlength) {
      return (Input)this.addAttr(new AttrMaxlengthObject(attrMaxlength));
   }

   public Input<Z> attrMin(java.lang.Object attrMin) {
      return (Input)this.addAttr(new AttrMinObject(attrMin));
   }

   public Input<Z> attrMultiple(java.lang.Object attrMultiple) {
      return (Input)this.addAttr(new AttrMultipleObject(attrMultiple));
   }

   public Input<Z> attrPattern(java.lang.Object attrPattern) {
      return (Input)this.addAttr(new AttrPatternObject(attrPattern));
   }

   public Input<Z> attrPlaceholder(java.lang.Object attrPlaceholder) {
      return (Input)this.addAttr(new AttrPlaceholderObject(attrPlaceholder));
   }

   public Input<Z> attrReadonly(java.lang.Object attrReadonly) {
      return (Input)this.addAttr(new AttrReadonlyObject(attrReadonly));
   }

   public Input<Z> attrRequired(java.lang.Object attrRequired) {
      return (Input)this.addAttr(new AttrRequiredObject(attrRequired));
   }

   public Input<Z> attrSize(java.lang.Object attrSize) {
      return (Input)this.addAttr(new AttrSizeObject(attrSize));
   }

   public Input<Z> attrSrc(String attrSrc) {
      return (Input)this.addAttr(new AttrSrcString(attrSrc));
   }

   public Input<Z> attrStep(java.lang.Object attrStep) {
      return (Input)this.addAttr(new AttrStepObject(attrStep));
   }

   public Input<Z> attrWidth(java.lang.Object attrWidth) {
      return (Input)this.addAttr(new AttrWidthObject(attrWidth));
   }

   public Input<Z> attrFiles(java.lang.Object attrFiles) {
      return (Input)this.addAttr(new AttrFilesObject(attrFiles));
   }

   public Input<Z> attrValue(java.lang.Object attrValue) {
      return (Input)this.addAttr(new AttrValueObject(attrValue));
   }
}
