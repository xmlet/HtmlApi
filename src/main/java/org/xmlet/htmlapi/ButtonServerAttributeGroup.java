package org.xmlet.htmlapi;

public interface ButtonServerAttributeGroup<T extends Element<T, Z>, Z extends Element> extends Element<T, Z> {
   default T attrCausesValidation(Boolean attrCausesValidation) {
      return this.addAttr(new AttrCausesValidationBoolean(attrCausesValidation));
   }

   default T attrValidationGroup(String attrValidationGroup) {
      return this.addAttr(new AttrValidationGroupString(attrValidationGroup));
   }

   default T attrOnServerClick(java.lang.Object attrOnServerClick) {
      return this.addAttr(new AttrOnServerClickObject(attrOnServerClick));
   }
}
