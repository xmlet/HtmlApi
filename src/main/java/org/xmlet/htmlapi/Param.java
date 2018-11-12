package org.xmlet.htmlapi;

public class Param<Z extends Element> extends AbstractElement<Param<Z>, Z> implements CoreAttributeGroup<Param<Z>, Z>, TextGroup<Param<Z>, Z> {
   public Param() {
      super("param");
   }

   public Param(String name) {
      super(name);
   }

   public Param(Z parent) {
      super(parent, "param");
   }

   public Param(Z parent, String name) {
      super(parent, name);
   }

   public Param<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Param<Z> cloneElem() {
      return (Param)this.clone(new Param());
   }

   public Param<Z> attrName(java.lang.Object attrName) {
      return (Param)this.addAttr(new AttrNameObject(attrName));
   }

   public Param<Z> attrValue(java.lang.Object attrValue) {
      return (Param)this.addAttr(new AttrValueObject(attrValue));
   }
}
