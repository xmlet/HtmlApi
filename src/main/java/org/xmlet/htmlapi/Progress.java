package org.xmlet.htmlapi;

public class Progress<Z extends Element> extends AbstractElement<Progress<Z>, Z> implements CommonAttributeGroup<Progress<Z>, Z>, PhrasingContentChoice<Progress<Z>, Z> {
   public Progress() {
      super("progress");
   }

   public Progress(String name) {
      super(name);
   }

   public Progress(Z parent) {
      super(parent, "progress");
   }

   public Progress(Z parent, String name) {
      super(parent, name);
   }

   public Progress<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Progress<Z> cloneElem() {
      return (Progress)this.clone(new Progress());
   }

   public Progress<Z> attrValue(Float attrValue) {
      return (Progress)this.addAttr(new AttrValueFloat(attrValue));
   }

   public Progress<Z> attrMax(Float attrMax) {
      return (Progress)this.addAttr(new AttrMaxFloat(attrMax));
   }
}
