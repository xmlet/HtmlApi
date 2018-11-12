package org.xmlet.htmlapi;

public class Tfoot<Z extends Element> extends AbstractElement<Tfoot<Z>, Z> implements CommonAttributeGroup<Tfoot<Z>, Z>, TfootChoice0<Tfoot<Z>, Z> {
   public Tfoot() {
      super("tfoot");
   }

   public Tfoot(String name) {
      super(name);
   }

   public Tfoot(Z parent) {
      super(parent, "tfoot");
   }

   public Tfoot(Z parent, String name) {
      super(parent, name);
   }

   public Tfoot<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Tfoot<Z> cloneElem() {
      return (Tfoot)this.clone(new Tfoot());
   }
}
