package org.xmlet.htmlapi;

public interface ClassAttributeGroup<T extends Element<T, Z>, Z extends Element> extends Element<T, Z> {
   default T attrClass(String attrClass) {
      return this.addAttr(new AttrClassString(attrClass));
   }
}
