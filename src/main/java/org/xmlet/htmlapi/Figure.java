package org.xmlet.htmlapi;

public class Figure<Z extends Element> extends AbstractElement<Figure<Z>, Z> implements CommonAttributeGroup<Figure<Z>, Z>, FigureChoice0<Figure<Z>, Z> {
   public Figure() {
      super("figure");
   }

   public Figure(String name) {
      super(name);
   }

   public Figure(Z parent) {
      super(parent, "figure");
   }

   public Figure(Z parent, String name) {
      super(parent, name);
   }

   public Figure<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Figure<Z> cloneElem() {
      return (Figure)this.clone(new Figure());
   }
}
