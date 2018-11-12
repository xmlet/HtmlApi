package org.xmlet.htmlapi;

public class Iframe<Z extends Element> extends AbstractElement<Iframe<Z>, Z> implements CommonAttributeGroup<Iframe<Z>, Z>, TextGroup<Iframe<Z>, Z> {
   public Iframe() {
      super("iframe");
   }

   public Iframe(String name) {
      super(name);
   }

   public Iframe(Z parent) {
      super(parent, "iframe");
   }

   public Iframe(Z parent, String name) {
      super(parent, name);
   }

   public Iframe<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Iframe<Z> cloneElem() {
      return (Iframe)this.clone(new Iframe());
   }

   public Iframe<Z> attrName(EnumNameBrowsingContext attrName) {
      return (Iframe)this.addAttr(new AttrNameEnumNameBrowsingContext(attrName));
   }

   public Iframe<Z> attrSrc(String attrSrc) {
      return (Iframe)this.addAttr(new AttrSrcString(attrSrc));
   }

   public Iframe<Z> attrHeight(java.lang.Object attrHeight) {
      return (Iframe)this.addAttr(new AttrHeightObject(attrHeight));
   }

   public Iframe<Z> attrWidth(java.lang.Object attrWidth) {
      return (Iframe)this.addAttr(new AttrWidthObject(attrWidth));
   }

   public Iframe<Z> attrSandbox(EnumSandboxIframe attrSandbox) {
      return (Iframe)this.addAttr(new AttrSandboxEnumSandboxIframe(attrSandbox));
   }

   public Iframe<Z> attrSeamless(EnumSeamlessIframe attrSeamless) {
      return (Iframe)this.addAttr(new AttrSeamlessEnumSeamlessIframe(attrSeamless));
   }
}
