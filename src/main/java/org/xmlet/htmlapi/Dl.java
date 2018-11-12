package org.xmlet.htmlapi;

public class Dl<Z extends Element> extends AbstractElement<Dl<Z>, Z> implements CommonAttributeGroup<Dl<Z>, Z>, DlChoice0<Dl<Z>, Z> {
   public Dl() {
      super("dl");
   }

   public Dl(String name) {
      super(name);
   }

   public Dl(Z parent) {
      super(parent, "dl");
   }

   public Dl(Z parent, String name) {
      super(parent, name);
   }

   public Dl<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Dl<Z> cloneElem() {
      return (Dl)this.clone(new Dl());
   }
}
