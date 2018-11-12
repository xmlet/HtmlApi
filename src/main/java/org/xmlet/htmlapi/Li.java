package org.xmlet.htmlapi;

public class Li<Z extends Element> extends AbstractElement<Li<Z>, Z> implements CommonAttributeGroup<Li<Z>, Z>, FlowContentChoice<Li<Z>, Z> {
   public Li() {
      super("li");
   }

   public Li(String name) {
      super(name);
   }

   public Li(Z parent) {
      super(parent, "li");
   }

   public Li(Z parent, String name) {
      super(parent, name);
   }

   public Li<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Li<Z> cloneElem() {
      return (Li)this.clone(new Li());
   }

   public Li<Z> attrValue(java.lang.Object attrValue) {
      return (Li)this.addAttr(new AttrValueObject(attrValue));
   }
}
