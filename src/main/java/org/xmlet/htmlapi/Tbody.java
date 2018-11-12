package org.xmlet.htmlapi;

public class Tbody<Z extends Element> extends AbstractElement<Tbody<Z>, Z> implements CommonAttributeGroup<Tbody<Z>, Z>, TbodyChoice0<Tbody<Z>, Z> {
   public Tbody() {
      super("tbody");
   }

   public Tbody(String name) {
      super(name);
   }

   public Tbody(Z parent) {
      super(parent, "tbody");
   }

   public Tbody(Z parent, String name) {
      super(parent, name);
   }

   public Tbody<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Tbody<Z> cloneElem() {
      return (Tbody)this.clone(new Tbody());
   }
}
