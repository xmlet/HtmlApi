package org.xmlet.htmlapi;

public class Table<Z extends Element> extends AbstractElement<Table<Z>, Z> implements CommonAttributeGroup<Table<Z>, Z>, TableChoice0<Table<Z>, Z> {
   public Table() {
      super("table");
   }

   public Table(String name) {
      super(name);
   }

   public Table(Z parent) {
      super(parent, "table");
   }

   public Table(Z parent, String name) {
      super(parent, name);
   }

   public Table<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Table<Z> cloneElem() {
      return (Table)this.clone(new Table());
   }

   public Table<Z> attrSummary(java.lang.Object attrSummary) {
      return (Table)this.addAttr(new AttrSummaryObject(attrSummary));
   }
}
