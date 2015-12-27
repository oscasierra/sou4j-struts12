package jp.sou4j.struts12.taglib.html;

import org.apache.struts.taglib.html.TextTag;

/**
 * <p>テキストボックスのタグをHTML5用に拡張した機能を提供するクラスです。</p>
 * @author OSCA
 * @since 1.0.0
 */
public class Html5TextTag extends TextTag {

	private static final long serialVersionUID = 1L;

	/**
	 * <p>autocomplete属性の値</p>
	 */
	private String autocomplete;

	/**
	 * <p>placeholder属性の値</p>
	 */
	private String placeholder;

	/**
	 * <p>autocomplete属性の値を返却します。</p>
	 * @return autocomplete属性の値
	 */
	public String getAutocomplete() {
	    return autocomplete;
	}

	/**
	 * <p>placeholder属性の値を返却します。</p>
	 * @return placeholder属性の値
	 */
	public String getPlaceholder() {
		return placeholder;
	}

	/**
	 * autocomplete属性の値を設定します。
	 * @param autocomplete autocomplete属性の値
	 */
	public void setAutocomplete(String autocomplete) {
	    this.autocomplete = autocomplete;
	}

	/**
	 * <p>placeholder属性の値を設定します。</p>
	 * @param placeholder placeholder属性の値
	 */
	public void setPlaceholder(String placeholder) {
		this.placeholder = placeholder;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
    protected void prepareOtherAttributes(StringBuffer handlers) {
        super.prepareOtherAttributes(handlers);
        this.prepareAttribute(handlers, "autocomplete", this.getAutocomplete());
        this.prepareAttribute(handlers, "placeholder",  this.getPlaceholder());
    }
}
