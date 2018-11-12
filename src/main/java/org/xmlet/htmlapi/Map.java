package org.xmlet.htmlapi;

public class Map<Z extends Element> extends AbstractElement<Map<Z>, Z> implements CommonAttributeGroup<Map<Z>, Z>, MapChoice0<Map<Z>, Z> {
   public Map() {
      super("map");
   }

   public Map(String name) {
      super(name);
   }

   public Map(Z parent) {
      super(parent, "map");
   }

   public Map(Z parent, String name) {
      super(parent, name);
   }

   public Map<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Map<Z> cloneElem() {
      return (Map)this.clone(new Map());
   }

   public Map<Z> attrName(java.lang.Object attrName) {
      return (Map)this.addAttr(new AttrNameObject(attrName));
   }
}
