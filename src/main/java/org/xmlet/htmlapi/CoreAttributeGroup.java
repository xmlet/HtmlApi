package org.xmlet.htmlapi;

public interface CoreAttributeGroup<T extends Element<T, Z>, Z extends Element> extends ClassAttributeGroup<T, Z> {
   default T attrRunat(EnumRunat attrRunat) {
      return this.addAttr(new AttrRunatEnumRunat(attrRunat));
   }

   default T attrAccesskey(java.lang.Object attrAccesskey) {
      return this.addAttr(new AttrAccesskeyObject(attrAccesskey));
   }

   default T attrContenteditable(EnumContenteditable attrContenteditable) {
      return this.addAttr(new AttrContenteditableEnumContenteditable(attrContenteditable));
   }

   default T attrContextmenu(java.lang.Object attrContextmenu) {
      return this.addAttr(new AttrContextmenuObject(attrContextmenu));
   }

   default T attrDataFolderName(java.lang.Object attrDataFolderName) {
      return this.addAttr(new AttrDataFolderNameObject(attrDataFolderName));
   }

   default T attrDataMsgId(java.lang.Object attrDataMsgId) {
      return this.addAttr(new AttrDataMsgIdObject(attrDataMsgId));
   }

   default T attrDir(EnumDir attrDir) {
      return this.addAttr(new AttrDirEnumDir(attrDir));
   }

   default T attrDraggable(EnumDraggable attrDraggable) {
      return this.addAttr(new AttrDraggableEnumDraggable(attrDraggable));
   }

   default T attrId(java.lang.Object attrId) {
      return this.addAttr(new AttrIdObject(attrId));
   }

   default T attrItem(java.lang.Object attrItem) {
      return this.addAttr(new AttrItemObject(attrItem));
   }

   default T attrHidden(EnumHidden attrHidden) {
      return this.addAttr(new AttrHiddenEnumHidden(attrHidden));
   }

   default T attrLang(java.lang.Object attrLang) {
      return this.addAttr(new AttrLangObject(attrLang));
   }

   default T attrItemprop(java.lang.Object attrItemprop) {
      return this.addAttr(new AttrItempropObject(attrItemprop));
   }

   default T attrRole(java.lang.Object attrRole) {
      return this.addAttr(new AttrRoleObject(attrRole));
   }

   default T attrSpellcheck(EnumSpellcheck attrSpellcheck) {
      return this.addAttr(new AttrSpellcheckEnumSpellcheck(attrSpellcheck));
   }

   default T attrStyle(java.lang.Object attrStyle) {
      return this.addAttr(new AttrStyleObject(attrStyle));
   }

   default T attrSubject(java.lang.Object attrSubject) {
      return this.addAttr(new AttrSubjectObject(attrSubject));
   }

   default T attrTabIndex(java.lang.Object attrTabIndex) {
      return this.addAttr(new AttrTabIndexObject(attrTabIndex));
   }

   default T attrTitle(java.lang.Object attrTitle) {
      return this.addAttr(new AttrTitleObject(attrTitle));
   }
}
