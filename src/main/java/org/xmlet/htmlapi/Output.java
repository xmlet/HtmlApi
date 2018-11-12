package org.xmlet.htmlapi;

public class Output<Z extends Element> extends AbstractElement<Output<Z>, Z> implements CommonAttributeGroup<Output<Z>, Z>, PhrasingContentChoice<Output<Z>, Z> {
   public Output() {
      super("output");
   }

   public Output(String name) {
      super(name);
   }

   public Output(Z parent) {
      super(parent, "output");
   }

   public Output(Z parent, String name) {
      super(parent, name);
   }

   public Output<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Output<Z> cloneElem() {
      return (Output)this.clone(new Output());
   }

   public Output<Z> attrFor(java.lang.Object attrFor) {
      return (Output)this.addAttr(new AttrForObject(attrFor));
   }

   public Output<Z> attrForm(java.lang.Object attrForm) {
      return (Output)this.addAttr(new AttrFormObject(attrForm));
   }

   public Output<Z> attrName(java.lang.Object attrName) {
      return (Output)this.addAttr(new AttrNameObject(attrName));
   }
}
