package org.xmlet.htmlapi;

public class Datalist<Z extends Element> extends AbstractElement<Datalist<Z>, Z> implements CommonAttributeGroup<Datalist<Z>, Z>, DatalistChoice0<Datalist<Z>, Z> {
   public Datalist() {
      super("datalist");
   }

   public Datalist(String name) {
      super(name);
   }

   public Datalist(Z parent) {
      super(parent, "datalist");
   }

   public Datalist(Z parent, String name) {
      super(parent, name);
   }

   public Datalist<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Datalist<Z> cloneElem() {
      return (Datalist)this.clone(new Datalist());
   }
}
