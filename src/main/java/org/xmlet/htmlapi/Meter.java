package org.xmlet.htmlapi;

public class Meter<Z extends Element> extends AbstractElement<Meter<Z>, Z> implements CommonAttributeGroup<Meter<Z>, Z>, PhrasingContentChoice<Meter<Z>, Z> {
   public Meter() {
      super("meter");
   }

   public Meter(String name) {
      super(name);
   }

   public Meter(Z parent) {
      super(parent, "meter");
   }

   public Meter(Z parent, String name) {
      super(parent, name);
   }

   public Meter<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Meter<Z> cloneElem() {
      return (Meter)this.clone(new Meter());
   }

   public Meter<Z> attrValue(Float attrValue) {
      return (Meter)this.addAttr(new AttrValueFloat(attrValue));
   }

   public Meter<Z> attrMin(Float attrMin) {
      return (Meter)this.addAttr(new AttrMinFloat(attrMin));
   }

   public Meter<Z> attrMax(Float attrMax) {
      return (Meter)this.addAttr(new AttrMaxFloat(attrMax));
   }

   public Meter<Z> attrLow(Float attrLow) {
      return (Meter)this.addAttr(new AttrLowFloat(attrLow));
   }

   public Meter<Z> attrHigh(Float attrHigh) {
      return (Meter)this.addAttr(new AttrHighFloat(attrHigh));
   }

   public Meter<Z> attrOptimum(Float attrOptimum) {
      return (Meter)this.addAttr(new AttrOptimumFloat(attrOptimum));
   }
}
