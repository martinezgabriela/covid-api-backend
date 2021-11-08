package com.dev.software.devsoftware.models.api;

public class Hospital {

	private String estado;
	private String estadoSigla;
	private String municipio;
	private String cnes;
	private String nomeCnes;
	private String dataNotificacaoOcupacao;
	private float ofertaRespiradores;
	private float ofertaHospCli;
	private float ofertaHospUti;
	private float ofertaSRAGCli;
	private float ofertaSRAGUti;
	private float ocupHospCli;
	private float ocupHospUti;
	private float ocupSRAGCli;
	private float ocupSRAGUti;
	private float altas;
	private float obitos;
	private boolean ocupacaoInformada;
	private boolean algumaOcupacaoInformada;

	// Getter Methods

	public String getEstado() {
		return estado;
	}

	public String getEstadoSigla() {
		return estadoSigla;
	}

	public String getMunicipio() {
		return municipio;
	}

	public String getCnes() {
		return cnes;
	}

	public String getNomeCnes() {
		return nomeCnes;
	}

	public String getDataNotificacaoOcupacao() {
		return dataNotificacaoOcupacao;
	}

	public float getOfertaRespiradores() {
		return ofertaRespiradores;
	}

	public float getOfertaHospCli() {
		return ofertaHospCli;
	}

	public float getOfertaHospUti() {
		return ofertaHospUti;
	}

	public float getOfertaSRAGCli() {
		return ofertaSRAGCli;
	}

	public float getOfertaSRAGUti() {
		return ofertaSRAGUti;
	}

	public float getOcupHospCli() {
		return ocupHospCli;
	}

	public float getOcupHospUti() {
		return ocupHospUti;
	}

	public float getOcupSRAGCli() {
		return ocupSRAGCli;
	}

	public float getOcupSRAGUti() {
		return ocupSRAGUti;
	}

	public float getAltas() {
		return altas;
	}

	public float getObitos() {
		return obitos;
	}

	public boolean getOcupacaoInformada() {
		return ocupacaoInformada;
	}

	public boolean getAlgumaOcupacaoInformada() {
		return algumaOcupacaoInformada;
	}

	// Setter Methods

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setEstadoSigla(String estadoSigla) {
		this.estadoSigla = estadoSigla;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public void setCnes(String cnes) {
		this.cnes = cnes;
	}

	public void setNomeCnes(String nomeCnes) {
		this.nomeCnes = nomeCnes;
	}

	public void setDataNotificacaoOcupacao(String dataNotificacaoOcupacao) {
		this.dataNotificacaoOcupacao = dataNotificacaoOcupacao;
	}

	public void setOfertaRespiradores(float ofertaRespiradores) {
		this.ofertaRespiradores = ofertaRespiradores;
	}

	public void setOfertaHospCli(float ofertaHospCli) {
		this.ofertaHospCli = ofertaHospCli;
	}

	public void setOfertaHospUti(float ofertaHospUti) {
		this.ofertaHospUti = ofertaHospUti;
	}

	public void setOfertaSRAGCli(float ofertaSRAGCli) {
		this.ofertaSRAGCli = ofertaSRAGCli;
	}

	public void setOfertaSRAGUti(float ofertaSRAGUti) {
		this.ofertaSRAGUti = ofertaSRAGUti;
	}

	public void setOcupHospCli(float ocupHospCli) {
		this.ocupHospCli = ocupHospCli;
	}

	public void setOcupHospUti(float ocupHospUti) {
		this.ocupHospUti = ocupHospUti;
	}

	public void setOcupSRAGCli(float ocupSRAGCli) {
		this.ocupSRAGCli = ocupSRAGCli;
	}

	public void setOcupSRAGUti(float ocupSRAGUti) {
		this.ocupSRAGUti = ocupSRAGUti;
	}

	public void setAltas(float altas) {
		this.altas = altas;
	}

	public void setObitos(float obitos) {
		this.obitos = obitos;
	}

	public void setOcupacaoInformada(boolean ocupacaoInformada) {
		this.ocupacaoInformada = ocupacaoInformada;
	}

	public void setAlgumaOcupacaoInformada(boolean algumaOcupacaoInformada) {
		this.algumaOcupacaoInformada = algumaOcupacaoInformada;
	}
}