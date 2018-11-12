package org.xmlet.htmlapi;

public interface TableChoice0<T extends Element<T, Z>, Z extends Element> extends TextGroup<T, Z> {
   default Caption<T> caption() {
      return (Caption)this.addChild(new Caption(this.self()));
   }

   default Colgroup<T> colgroup() {
      return (Colgroup)this.addChild(new Colgroup(this.self()));
   }

   default Thead<T> thead() {
      return (Thead)this.addChild(new Thead(this.self()));
   }

   default Tfoot<T> tfoot() {
      return (Tfoot)this.addChild(new Tfoot(this.self()));
   }

   default Tbody<T> tbody() {
      return (Tbody)this.addChild(new Tbody(this.self()));
   }

   default Tr<T> tr() {
      return (Tr)this.addChild(new Tr(this.self()));
   }
}
