package org.xmlet.htmlapi;

import javax.xml.datatype.XMLGregorianCalendar;

public class Time<Z extends Element> extends AbstractElement<Time<Z>, Z> implements CommonAttributeGroup<Time<Z>, Z>, PhrasingContentChoice<Time<Z>, Z> {
   public Time() {
      super("time");
   }

   public Time(String name) {
      super(name);
   }

   public Time(Z parent) {
      super(parent, "time");
   }

   public Time(Z parent, String name) {
      super(parent, name);
   }

   public Time<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Time<Z> cloneElem() {
      return (Time)this.clone(new Time());
   }

   public Time<Z> attrDatetime(XMLGregorianCalendar attrDatetime) {
      return (Time)this.addAttr(new AttrDatetimeXMLGregorianCalendar(attrDatetime));
   }
}
