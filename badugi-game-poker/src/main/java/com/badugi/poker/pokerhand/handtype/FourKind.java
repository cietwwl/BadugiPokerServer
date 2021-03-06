/**
 * 深圳市辰富科技有限公司 .inc
 * Texas Poker Game App V1.0
 */
/**
 * author  yuesheng.yin
 * createTime 2011-1-21下午03:58:14
 */
package com.badugi.poker.pokerhand.handtype;
import java.util.List;

import com.badugi.poker.Card;
import com.badugi.poker.TexasConstant.PokerHandType;
import com.badugi.poker.pokerhand.PokerHandBase;


/**
 * 四条 , 炸弹(四张相同 + 一单张)
 * 
 * @author yuesheng.yin
 * 
 */
public class FourKind extends PokerHandBase implements Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7685978543836439467L;

	public FourKind(List<Card> cardLi) {
		super.setCards(cardLi.toArray(new Card[cardLi.size()]));
	}

	public FourKind() {
		
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.texas.logic.pokerhand.PokerHand#getPokerHandType()
	 */
	@Override
	public PokerHandType getPokerHandType() {
		// TODO Auto-generated method stub
		return PokerHandType.FOUR_OF_A_KIND;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	public int compareTo(PokerHandBase o) {
		if (getPokerHandType().getValue() != o.getPokerHandType().getValue())
			return getPokerHandType().getValue() - o.getPokerHandType().getValue();
		if (super.getCard(0).compareTo(o.getCard(0)) == 0)
			return super.getCard(4).compareTo(o.getCard(4));// 同种类型的牌的比对规则
		return super.getCard(0).compareTo(o.getCard(0));
	}
	
	@Override
	protected Object clone() {
		FourKind flush = null;
		try {
			flush = (FourKind) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return flush;
	}

}
