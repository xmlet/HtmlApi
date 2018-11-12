package org.xmlet.htmlapi;

import javax.xml.datatype.XMLGregorianCalendar;

public class Del<Z extends Element> extends AbstractElement<Del<Z>, Z> implements CommonAttributeGroup<Del<Z>, Z>, PhrasingContentChoice<Del<Z>, Z> {
   public Del() {
      super("del");
   }

   public Del(String name) {
      super(name);
   }

   public Del(Z parent) {
      super(parent, "del");
   }

   public Del(Z parent, String name) {
      super(parent, name);
   }

   public Del<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Del<Z> cloneElem() {
      return (Del)this.clone(new Del());
   }

   public Del<Z> attrCite(String attrCite) {
      return (Del)this.addAttr(new AttrCiteString(attrCite));
   }

   public Del<Z> attrDatetime(XMLGregorianCalendar attrDatetime) {
      return (Del)this.addAttr(new AttrDatetimeXMLGregorianCalendar(attrDatetime));
   }
}
