package org.xmlet.htmlapi;

public class Menu<Z extends Element> extends AbstractElement<Menu<Z>, Z> implements CommonAttributeGroup<Menu<Z>, Z>, MenuChoice0<Menu<Z>, Z> {
   public Menu() {
      super("menu");
   }

   public Menu(String name) {
      super(name);
   }

   public Menu(Z parent) {
      super(parent, "menu");
   }

   public Menu(Z parent, String name) {
      super(parent, name);
   }

   public Menu<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Menu<Z> cloneElem() {
      return (Menu)this.clone(new Menu());
   }

   public Menu<Z> attrType(EnumTypeMenu attrType) {
      return (Menu)this.addAttr(new AttrTypeEnumTypeMenu(attrType));
   }

   public Menu<Z> attrLabel(java.lang.Object attrLabel) {
      return (Menu)this.addAttr(new AttrLabelObject(attrLabel));
   }
}
