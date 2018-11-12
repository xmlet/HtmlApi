package org.xmlet.htmlapi;

public class Dialog<Z extends Element> extends AbstractElement<Dialog<Z>, Z> implements CommonAttributeGroup<Dialog<Z>, Z>, DialogChoice0<Dialog<Z>, Z> {
   public Dialog() {
      super("dialog");
   }

   public Dialog(String name) {
      super(name);
   }

   public Dialog(Z parent) {
      super(parent, "dialog");
   }

   public Dialog(Z parent, String name) {
      super(parent, name);
   }

   public Dialog<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Dialog<Z> cloneElem() {
      return (Dialog)this.clone(new Dialog());
   }
}
