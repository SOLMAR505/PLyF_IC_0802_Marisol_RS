evento(00,gonorte,gonorte).
evento(01,gonorte,waitnorte).
evento(10,gonorte,gonorte).
evento(11,gonorte,waitnorte).

evento(00,waitnorte,goeste).
evento(01,waitnorte,goeste).
evento(10,waitnorte,goeste).
evento(11,waitnorte,goeste).

evento(00,goeste,goeste).
evento(01,goeste,goeste).
evento(10,goeste,waiteste).
evento(11,goeste,waiteste).

evento(00,waiteste,gonorte).
evento(01,waiteste,gonorte).
evento(10,waiteste,gonorte).
evento(11,waiteste,gonorte).

acciones(estado,[accion|estsig]):- evento(accion,estado,Z),write(Z),nl,eventos(Z,estsig).
