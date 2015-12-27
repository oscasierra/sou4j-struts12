package jp.sou4j.struts12.taglib.html;

import org.apache.struts.taglib.html.PasswordTag;

/**
 * <p>パスワード入力タグをHTML5用に拡張した機能を提供するクラスです。</p>
 * @author OSCA
 * @since 1.0.0
 */
public class Html5PasswordTag extends PasswordTag {

	private static final long serialVersionUID = 1L;

	/**
	 * <p>placeholder属性の値</p>
	 */
	private String placeholder;

	/**
	 * <p>placeholder属性の値を返却します。</p>
	 * @return placeholder属性の値
	 */
	public String getPlaceholder() {
		return placeholder;
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
        this.prepareAttribute(handlers, "placeholder", this.getPlaceholder());
    }
}
