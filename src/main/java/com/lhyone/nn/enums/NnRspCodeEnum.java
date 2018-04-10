package com.lhyone.nn.enums;

public enum NnRspCodeEnum {
	
	/**成功*/
	$0000("0000","成功"),
	
	/**用户未授权*/
	$0001("0001","用户未授权"),
	
	/**加倍规则设置错误*/
	$0002("0002","加倍规则设置错误"),
	
	/**操作类型不合法*/
	$0003("0003","操作类型不合法"),
	
	/**无效参数*/
	$0004("0004","无效参数"),
	
	/**请勿重复提交*/
	$0005("0005","请勿重复提交"),
	
	/**系统繁忙请稍后重试*/
	$0006("0006","系统繁忙请稍后重试"),
	
	/**************************************房间信息1001-1110编码****************************************************/
	/**房间不存在*/
	$1001("1001","房间不存在"),
	
	/**上局比赛未结束，无法加入此房间*/
	$1002("1002","上局比赛未结束，无法加入此房间"),
	
	/**您已申请坐庄，请耐心等待*/
	$1003("1003","您已申请坐庄，请耐心等待"),
	
	/**用户已加入其它房间*/
	$1004("1004","用户已加入其它房间"),
	
	/**房间人数已满或者已开赛*/
	$1005("1005","房间人数已满或者已开赛"),
	
	/**加注时间已结束,请等待个下个回合加注*/
	$1006("1006","加注时间已结束,请等待个下个回合加注"),

	/**金币不足无法参与坐庄*/
	$1107("1107","金币不足无法参与坐庄,请充值后操作"),
	
	/**比赛已开赛无法退出房间*/
	$1008("1008","请比赛结束后退出房间"),
	
	/**请等待比赛结束后退出房间*/
	$1009("1009","请等待比赛结束后退出房间"),
	
	/***************************************用户操作错误1101-1201******************************************************************************/
	/**金币不足,无法完成此次操作*/
	$1101("1101","金币不足,无法完成此次操作"),
	
	
	/***************************************每100类型递增*******************************************************************************/
	/**未知异常*/
	$9999("9999","未知异常");
	
	private String code;
	
	private String msg;
	

	private NnRspCodeEnum(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	public static NnRspCodeEnum getByCode(String code) {
        for (NnRspCodeEnum enums : NnRspCodeEnum.values()) {
            if (enums.code.equals(code)) {
                return enums;
            }
        }
        return null;
    }
	public String getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}
	
	
}
