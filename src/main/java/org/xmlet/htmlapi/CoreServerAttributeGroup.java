package org.xmlet.htmlapi;

public interface CoreServerAttributeGroup<T extends Element<T, Z>, Z extends Element> extends Element<T, Z> {
   default T attrEnableTheming(Boolean attrEnableTheming) {
      return this.addAttr(new AttrEnableThemingBoolean(attrEnableTheming));
   }

   default T attrEnableViewState(Boolean attrEnableViewState) {
      return this.addAttr(new AttrEnableViewStateBoolean(attrEnableViewState));
   }

   default T attrSkinID(String attrSkinID) {
      return this.addAttr(new AttrSkinIDString(attrSkinID));
   }

   default T attrVisible(Boolean attrVisible) {
      return this.addAttr(new AttrVisibleBoolean(attrVisible));
   }

   default T attrOnDataBinding(java.lang.Object attrOnDataBinding) {
      return this.addAttr(new AttrOnDataBindingObject(attrOnDataBinding));
   }

   default T attrOnDisposed(java.lang.Object attrOnDisposed) {
      return this.addAttr(new AttrOnDisposedObject(attrOnDisposed));
   }

   default T attrOnInit(java.lang.Object attrOnInit) {
      return this.addAttr(new AttrOnInitObject(attrOnInit));
   }

   default T attrOnLoad(java.lang.Object attrOnLoad) {
      return this.addAttr(new AttrOnLoadObject(attrOnLoad));
   }

   default T attrOnPreRender(java.lang.Object attrOnPreRender) {
      return this.addAttr(new AttrOnPreRenderObject(attrOnPreRender));
   }

   default T attrOnUnloadAlt(java.lang.Object attrOnUnloadAlt) {
      return this.addAttr(new AttrOnUnloadAltObject(attrOnUnloadAlt));
   }
}
