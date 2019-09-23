package com.jeremiahVaris.currencyconverter

class CurrencyFlagPair(val currencyName: String, var flagImage: Int = R.drawable.placeholder) {
    init {
        flagImage = PresetCurrencyFlagMapping[currencyName] ?: R.drawable.placeholder
    }
}

object PresetCurrencyFlagMapping : HashMap<String, Int>(HashMap<String, Int>().apply {
    put("AED", R.drawable.aed)
    put("AFN", R.drawable.afn)
    put("ALL", R.drawable.all)
    put("AMD", R.drawable.amd)
    put("ANG", R.drawable.ang)
    put("AOA", R.drawable.aoa)
    put("ARS", R.drawable.ars)
    put("AUD", R.drawable.aud)
    put("AWG", R.drawable.awg)
    put("AZN", R.drawable.azn)
    put("BAM", R.drawable.bam)
    put("BBD", R.drawable.bbd)
    put("BDT", R.drawable.bdt)
    put("BGN", R.drawable.bgn)
    put("BHD", R.drawable.bhd)
    put("BIF", R.drawable.bif)
    put("BMD", R.drawable.bmd)
    put("BMP", R.drawable.bmp)
    put("BND", R.drawable.bnd)
    put("BOB", R.drawable.bob)
    put("BRL", R.drawable.brl)
    put("BSD", R.drawable.bsd)
    put("BTC", R.drawable.btc)
    put("BTN", R.drawable.btn)
    put("BWP", R.drawable.bwp)
    put("BYN", R.drawable.byn)
    put("BYR", R.drawable.byr)
    put("BZD", R.drawable.bzd)
    put("CAD", R.drawable.cad)
    put("CDF", R.drawable.cdf)
    put("CHF", R.drawable.chf)
    put("CLP", R.drawable.clp)
    put("CNY", R.drawable.cny)
    put("COP", R.drawable.cop)
    put("CRC", R.drawable.crc)
    put("CUC", R.drawable.cuc)
    put("CUP", R.drawable.cup)
    put("CVE", R.drawable.cve)
    put("CZK", R.drawable.czk)
    put("DJF", R.drawable.djf)
    put("DKK", R.drawable.dkk)
    put("DOP", R.drawable.dop)
    put("DZD", R.drawable.dzd)
    put("EGP", R.drawable.egp)
    put("ERN", R.drawable.ern)
    put("ETB", R.drawable.etb)
    put("EUR", R.drawable.eur)
    put("FJD", R.drawable.fjd)
    put("FKP", R.drawable.fkp)
    put("GBP", R.drawable.gbp)
    put("GEL", R.drawable.gel)
    put("GGP", R.drawable.ggp)
    put("GHS", R.drawable.ghs)
    put("GIP", R.drawable.gip)
    put("GMD", R.drawable.gmd)
    put("GNF", R.drawable.gnf)
    put("GTQ", R.drawable.gtq)
    put("GYD", R.drawable.gyd)
    put("HKD", R.drawable.hkd)
    put("HNL", R.drawable.hnl)
    put("HRK", R.drawable.hrk)
    put("HTG", R.drawable.htg)
    put("HUF", R.drawable.huf)
    put("IDR", R.drawable.idr)
    put("ILS", R.drawable.ils)
    put("IMP", R.drawable.imp)
    put("INR", R.drawable.inr)
    put("IQD", R.drawable.iqd)
    put("IRR", R.drawable.irr)
    put("ISK", R.drawable.isk)
    put("JEP", R.drawable.jep)
    put("JMD", R.drawable.jmd)
    put("JOD", R.drawable.jod)
    put("JPY", R.drawable.jpy)
    put("KES", R.drawable.kes)
    put("KGS", R.drawable.kgs)
    put("KHR", R.drawable.khr)
    put("KMF", R.drawable.kmf)
    put("KPW", R.drawable.kpw)
    put("KRW", R.drawable.krw)
    put("KWD", R.drawable.kwd)
    put("KYD", R.drawable.kyd)
    put("KZT", R.drawable.kzt)
    put("LAK", R.drawable.lak)
    put("LBP", R.drawable.lbp)
    put("LKR", R.drawable.lkr)
    put("LRD", R.drawable.lrd)
    put("LSL", R.drawable.lsl)
    put("LYD", R.drawable.lyd)
    put("MAD", R.drawable.mad)
    put("MDL", R.drawable.mdl)
    put("MGA", R.drawable.mga)
    put("MKD", R.drawable.mkd)
    put("MMK", R.drawable.mmk)
    put("MNT", R.drawable.mnt)
    put("MOP", R.drawable.mop)
    put("MRO", R.drawable.mro)
    put("MUR", R.drawable.mur)
    put("MVR", R.drawable.mvr)
    put("MWK", R.drawable.mwk)
    put("MXN", R.drawable.mxn)
    put("MYR", R.drawable.myr)
    put("MZN", R.drawable.mzn)
    put("NAD", R.drawable.nad)
    put("NGN", R.drawable.ngn)
    put("NIO", R.drawable.nio)
    put("NOK", R.drawable.nok)
    put("NPR", R.drawable.npr)
    put("NZD", R.drawable.nzd)
    put("OMR", R.drawable.omr)
    put("PAB", R.drawable.pab)
    put("PEN", R.drawable.pen)
    put("PGK", R.drawable.pgk)
    put("PHP", R.drawable.php)
    put("PKR", R.drawable.pkr)
    put("PLN", R.drawable.pln)
    put("PYG", R.drawable.pyg)
    put("QAR", R.drawable.qar)
    put("RON", R.drawable.ron)
    put("RSD", R.drawable.rsd)
    put("RUB", R.drawable.rub)
    put("RWF", R.drawable.rwf)
    put("SAR", R.drawable.sar)
    put("SBD", R.drawable.sbd)
    put("SCR", R.drawable.scr)
    put("SEK", R.drawable.sek)
    put("SGD", R.drawable.sgd)
    put("SHP", R.drawable.shp)
    put("SLL", R.drawable.sll)
    put("SOS", R.drawable.sos)
    put("SRD", R.drawable.srd)
    put("STD", R.drawable.std)
    put("SVC", R.drawable.svc)
    put("SYP", R.drawable.syp)
    put("SZL", R.drawable.szl)
    put("THB", R.drawable.thb)
    put("TJS", R.drawable.tjs)
    put("TMT", R.drawable.tmt)
    put("TND", R.drawable.tnd)
    put("TOP", R.drawable.top)
    put("TRY", R.drawable.try_)
    put("TTD", R.drawable.ttd)
    put("TWD", R.drawable.twd)
    put("TZS", R.drawable.tzs)
    put("UAH", R.drawable.uah)
    put("UGX", R.drawable.ugx)
    put("USD", R.drawable.usd)
    put("UYU", R.drawable.uyu)
    put("UZS", R.drawable.uzs)
    put("VEF", R.drawable.vef)
    put("VND", R.drawable.vnd)
    put("VUV", R.drawable.vuv)
    put("WST", R.drawable.wst)
    put("XAF", R.drawable.xaf)
    put("XCD", R.drawable.xcd)
    put("XDR", R.drawable.xdr)
    put("XOF", R.drawable.xof)
    put("XPF", R.drawable.xpf)
    put("YER", R.drawable.yer)
    put("ZAR", R.drawable.zar)
    put("ZMK", R.drawable.zmk)
    put("ZMW", R.drawable.zmw)
    put("ZWL", R.drawable.zwl)
})