package org.xmlet.htmlapi;

public class Ul<Z extends Element> extends AbstractElement<Ul<Z>, Z> implements CommonAttributeGroup<Ul<Z>, Z>, UlChoice0<Ul<Z>, Z> {
   public Ul() {
      super("ul");
   }

   public Ul(String name) {
      super(name);
   }

   public Ul(Z parent) {
      super(parent, "ul");
   }

   public Ul(Z parent, String name) {
      super(parent, name);
   }

   public Ul<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Ul<Z> cloneElem() {
      return (Ul)this.clone(new Ul());
   }
}
