package org.xmlet.htmlapi;

import javax.xml.datatype.XMLGregorianCalendar;

public class Ins<Z extends Element> extends AbstractElement<Ins<Z>, Z> implements CommonAttributeGroup<Ins<Z>, Z>, PhrasingContentChoice<Ins<Z>, Z> {
   public Ins() {
      super("ins");
   }

   public Ins(String name) {
      super(name);
   }

   public Ins(Z parent) {
      super(parent, "ins");
   }

   public Ins(Z parent, String name) {
      super(parent, name);
   }

   public Ins<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Ins<Z> cloneElem() {
      return (Ins)this.clone(new Ins());
   }

   public Ins<Z> attrCite(String attrCite) {
      return (Ins)this.addAttr(new AttrCiteString(attrCite));
   }

   public Ins<Z> attrDatetime(XMLGregorianCalendar attrDatetime) {
      return (Ins)this.addAttr(new AttrDatetimeXMLGregorianCalendar(attrDatetime));
   }
}
