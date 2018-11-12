package org.xmlet.htmlapi;

public interface CommonEventsGroup<T extends Element<T, Z>, Z extends Element> extends Element<T, Z> {
   default T attrOnabort(java.lang.Object attrOnabort) {
      return this.addAttr(new AttrOnabortObject(attrOnabort));
   }

   default T attrOnblur(java.lang.Object attrOnblur) {
      return this.addAttr(new AttrOnblurObject(attrOnblur));
   }

   default T attrOncanplay(java.lang.Object attrOncanplay) {
      return this.addAttr(new AttrOncanplayObject(attrOncanplay));
   }

   default T attrOncanplaythrough(java.lang.Object attrOncanplaythrough) {
      return this.addAttr(new AttrOncanplaythroughObject(attrOncanplaythrough));
   }

   default T attrOnchange(java.lang.Object attrOnchange) {
      return this.addAttr(new AttrOnchangeObject(attrOnchange));
   }

   default T attrOnclick(java.lang.Object attrOnclick) {
      return this.addAttr(new AttrOnclickObject(attrOnclick));
   }

   default T attrOncontextmenu(java.lang.Object attrOncontextmenu) {
      return this.addAttr(new AttrOncontextmenuObject(attrOncontextmenu));
   }

   default T attrOndblclick(java.lang.Object attrOndblclick) {
      return this.addAttr(new AttrOndblclickObject(attrOndblclick));
   }

   default T attrOndrag(java.lang.Object attrOndrag) {
      return this.addAttr(new AttrOndragObject(attrOndrag));
   }

   default T attrOndragenter(java.lang.Object attrOndragenter) {
      return this.addAttr(new AttrOndragenterObject(attrOndragenter));
   }

   default T attrOndragleave(java.lang.Object attrOndragleave) {
      return this.addAttr(new AttrOndragleaveObject(attrOndragleave));
   }

   default T attrOndragover(java.lang.Object attrOndragover) {
      return this.addAttr(new AttrOndragoverObject(attrOndragover));
   }

   default T attrOndragstart(java.lang.Object attrOndragstart) {
      return this.addAttr(new AttrOndragstartObject(attrOndragstart));
   }

   default T attrOndrop(java.lang.Object attrOndrop) {
      return this.addAttr(new AttrOndropObject(attrOndrop));
   }

   default T attrOndurationchange(java.lang.Object attrOndurationchange) {
      return this.addAttr(new AttrOndurationchangeObject(attrOndurationchange));
   }

   default T attrOnemptied(java.lang.Object attrOnemptied) {
      return this.addAttr(new AttrOnemptiedObject(attrOnemptied));
   }

   default T attrOnended(java.lang.Object attrOnended) {
      return this.addAttr(new AttrOnendedObject(attrOnended));
   }

   default T attrOnerror(java.lang.Object attrOnerror) {
      return this.addAttr(new AttrOnerrorObject(attrOnerror));
   }

   default T attrOnfocus(java.lang.Object attrOnfocus) {
      return this.addAttr(new AttrOnfocusObject(attrOnfocus));
   }

   default T attrOnformchange(java.lang.Object attrOnformchange) {
      return this.addAttr(new AttrOnformchangeObject(attrOnformchange));
   }

   default T attrOnforminput(java.lang.Object attrOnforminput) {
      return this.addAttr(new AttrOnforminputObject(attrOnforminput));
   }

   default T attrOninput(java.lang.Object attrOninput) {
      return this.addAttr(new AttrOninputObject(attrOninput));
   }

   default T attrOninvalid(java.lang.Object attrOninvalid) {
      return this.addAttr(new AttrOninvalidObject(attrOninvalid));
   }

   default T attrOnkeydown(java.lang.Object attrOnkeydown) {
      return this.addAttr(new AttrOnkeydownObject(attrOnkeydown));
   }

   default T attrOnkeypress(java.lang.Object attrOnkeypress) {
      return this.addAttr(new AttrOnkeypressObject(attrOnkeypress));
   }

   default T attrOnkeyup(java.lang.Object attrOnkeyup) {
      return this.addAttr(new AttrOnkeyupObject(attrOnkeyup));
   }

   default T attrOnloadAlt(java.lang.Object attrOnloadAlt) {
      return this.addAttr(new AttrOnloadAltObject(attrOnloadAlt));
   }

   default T attrOnloadeddata(java.lang.Object attrOnloadeddata) {
      return this.addAttr(new AttrOnloadeddataObject(attrOnloadeddata));
   }

   default T attrOnloadedmetadata(java.lang.Object attrOnloadedmetadata) {
      return this.addAttr(new AttrOnloadedmetadataObject(attrOnloadedmetadata));
   }

   default T attrOnloadstart(java.lang.Object attrOnloadstart) {
      return this.addAttr(new AttrOnloadstartObject(attrOnloadstart));
   }

   default T attrOnmousedown(java.lang.Object attrOnmousedown) {
      return this.addAttr(new AttrOnmousedownObject(attrOnmousedown));
   }

   default T attrOnmousemove(java.lang.Object attrOnmousemove) {
      return this.addAttr(new AttrOnmousemoveObject(attrOnmousemove));
   }

   default T attrOnmouseout(java.lang.Object attrOnmouseout) {
      return this.addAttr(new AttrOnmouseoutObject(attrOnmouseout));
   }

   default T attrOnmouseover(java.lang.Object attrOnmouseover) {
      return this.addAttr(new AttrOnmouseoverObject(attrOnmouseover));
   }

   default T attrOnmouseup(java.lang.Object attrOnmouseup) {
      return this.addAttr(new AttrOnmouseupObject(attrOnmouseup));
   }

   default T attrOnmousewheel(java.lang.Object attrOnmousewheel) {
      return this.addAttr(new AttrOnmousewheelObject(attrOnmousewheel));
   }

   default T attrOnpause(java.lang.Object attrOnpause) {
      return this.addAttr(new AttrOnpauseObject(attrOnpause));
   }

   default T attrOnplay(java.lang.Object attrOnplay) {
      return this.addAttr(new AttrOnplayObject(attrOnplay));
   }

   default T attrOnplaying(java.lang.Object attrOnplaying) {
      return this.addAttr(new AttrOnplayingObject(attrOnplaying));
   }

   default T attrOnprogress(java.lang.Object attrOnprogress) {
      return this.addAttr(new AttrOnprogressObject(attrOnprogress));
   }

   default T attrOnratechange(java.lang.Object attrOnratechange) {
      return this.addAttr(new AttrOnratechangeObject(attrOnratechange));
   }

   default T attrOnreadystatechange(java.lang.Object attrOnreadystatechange) {
      return this.addAttr(new AttrOnreadystatechangeObject(attrOnreadystatechange));
   }

   default T attrOnscroll(java.lang.Object attrOnscroll) {
      return this.addAttr(new AttrOnscrollObject(attrOnscroll));
   }

   default T attrOnseeked(java.lang.Object attrOnseeked) {
      return this.addAttr(new AttrOnseekedObject(attrOnseeked));
   }

   default T attrOnseeking(java.lang.Object attrOnseeking) {
      return this.addAttr(new AttrOnseekingObject(attrOnseeking));
   }

   default T attrOnselect(java.lang.Object attrOnselect) {
      return this.addAttr(new AttrOnselectObject(attrOnselect));
   }

   default T attrOnshow(java.lang.Object attrOnshow) {
      return this.addAttr(new AttrOnshowObject(attrOnshow));
   }

   default T attrOnstalled(java.lang.Object attrOnstalled) {
      return this.addAttr(new AttrOnstalledObject(attrOnstalled));
   }

   default T attrOnsubmit(java.lang.Object attrOnsubmit) {
      return this.addAttr(new AttrOnsubmitObject(attrOnsubmit));
   }

   default T attrOnsuspend(java.lang.Object attrOnsuspend) {
      return this.addAttr(new AttrOnsuspendObject(attrOnsuspend));
   }

   default T attrOntimeupdate(java.lang.Object attrOntimeupdate) {
      return this.addAttr(new AttrOntimeupdateObject(attrOntimeupdate));
   }

   default T attrOnvolumenchange(java.lang.Object attrOnvolumenchange) {
      return this.addAttr(new AttrOnvolumenchangeObject(attrOnvolumenchange));
   }

   default T attrOnwaiting(java.lang.Object attrOnwaiting) {
      return this.addAttr(new AttrOnwaitingObject(attrOnwaiting));
   }
}
