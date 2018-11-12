package org.xmlet.htmlapi;

public interface HgroupChoice0<T extends Element<T, Z>, Z extends Element> extends TextGroup<T, Z> {
   default H1<T> h1() {
      return (H1)this.addChild(new H1(this.self()));
   }

   default H2<T> h2() {
      return (H2)this.addChild(new H2(this.self()));
   }

   default H3<T> h3() {
      return (H3)this.addChild(new H3(this.self()));
   }

   default H4<T> h4() {
      return (H4)this.addChild(new H4(this.self()));
   }

   default H5<T> h5() {
      return (H5)this.addChild(new H5(this.self()));
   }

   default H6<T> h6() {
      return (H6)this.addChild(new H6(this.self()));
   }
}
