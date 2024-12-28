/**
 * Copyright (c) 2018, 2020 ControlsFX
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 *     * Neither the name of ControlsFX, any associated website, nor the
 * names of its contributors may be used to endorse or promote products
 * derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL CONTROLSFX BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

/**
 * Defines the UI controls, and skins that are available in ControlsFX.
 */
module org.controlsfx.controls {

    requires java.desktop;

    requires transitive javafx.controls;
    requires static javafx.media;
    requires java.logging;
    requires javafx.base;

    //MS DISABLE overridden implementations (only export them to samples)
    exports org.controlsfx.control;
    exports org.controlsfx.control.action;
    exports org.controlsfx.control.cell;
    exports org.controlsfx.control.decoration to org.controlsfx.samples;
    exports org.controlsfx.control.spreadsheet;
    exports org.controlsfx.control.table;
    exports org.controlsfx.control.tableview2;
    exports org.controlsfx.control.tableview2.actions;
    exports org.controlsfx.control.tableview2.cell;
    exports org.controlsfx.control.tableview2.event;
    exports org.controlsfx.control.tableview2.filter.filtereditor;
    exports org.controlsfx.control.tableview2.filter.filtermenubutton;
    exports org.controlsfx.control.tableview2.filter.parser;
    exports org.controlsfx.control.tableview2.filter.popupfilter;
    exports org.controlsfx.control.textfield;
    exports org.controlsfx.dialog;
    exports org.controlsfx.glyphfont;
    exports org.controlsfx.property;
    exports org.controlsfx.property.editor;
    exports org.controlsfx.tools;
    exports org.controlsfx.validation to org.controlsfx.samples;
    exports org.controlsfx.validation.decoration to org.controlsfx.samples;

    exports impl.org.controlsfx.skin to org.controlsfx.samples;

    /* MS START EDIT*/
    //Open css files
    opens org.controlsfx.control;
    opens org.controlsfx.control.spreadsheet;
    opens org.controlsfx.control.tableview2;
    opens org.controlsfx.control.textfield;
    /* MS STOP EDIT*/

    uses org.controlsfx.glyphfont.GlyphFont;
    provides org.controlsfx.glyphfont.GlyphFont with org.controlsfx.glyphfont.FontAwesome;
}