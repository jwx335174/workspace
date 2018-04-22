webpackJsonp([7],{LY6C:function(t,e,a){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var i=a("BO1k"),o=a.n(i),l=a("woOf"),r=a.n(l),n=a("vLgD");var s=a("KA92"),d={name:"Product",directives:{waves:a("cAgV").a},data:function(){return{list:void 0,total:void 0,listLoading:!0,listQuery:{page:1,limit:20,goodsId:void 0,sort:"+id"},createDialogFormVisible:!1,editDialogFormVisible:!1,dataForm:{id:void 0,goodsId:void 0,goodsSpecificationIds:void 0,goodsNumber:0,retailPrice:0,url:void 0},rules:{goodsId:[{required:!0,message:"商品ID不能为空",trigger:"blur"}],goodsSpecificationIds:[{required:!0,message:"商品规格ID列表不能为空",trigger:"blur"}]},downloadLoading:!1}},created:function(){this.getList()},methods:{getList:function(){var t,e=this;this.listLoading=!0,(t=this.listQuery,Object(n.a)({url:"/product/list",method:"get",params:t})).then(function(t){e.list=t.data.data.items,e.total=t.data.data.total,e.listLoading=!1}).catch(function(){e.list=[],e.total=0,e.listLoading=!1})},handleFilter:function(){this.listQuery.page=1,this.getList()},handleSizeChange:function(t){this.listQuery.limit=t,this.getList()},handleCurrentChange:function(t){this.listQuery.page=t,this.getList()},resetForm:function(){this.dataForm={id:void 0,goodsId:void 0,goodsSpecificationIds:void 0,goodsNumber:0,retailPrice:0,url:void 0}},uploadUrl:function(t){var e=this,a=new FormData;a.append("file",t.file),Object(s.a)(a).then(function(t){e.dataForm.url=t.data.data.url}).catch(function(){e.$message.error("上传失败，请重新上传")})},handleCreate:function(){var t=this;this.resetForm(),this.createDialogFormVisible=!0,this.$nextTick(function(){t.$refs.dataForm.clearValidate()})},createData:function(){var t=this;this.$refs.dataForm.validate(function(e){var a;e&&(a=t.dataForm,Object(n.a)({url:"/product/create",method:"post",data:a})).then(function(e){t.getList(),t.createDialogFormVisible=!1,t.$notify({title:"成功",message:"创建成功",type:"success",duration:2e3})})})},handleUpdate:function(t){var e=this;this.dataForm=r()({},t),this.editDialogFormVisible=!0,this.$nextTick(function(){e.$refs.dataForm.clearValidate()})},updateData:function(){var t=this;this.$refs.dataForm.validate(function(e){var a;e&&(a=t.dataForm,Object(n.a)({url:"/product/update",method:"post",data:a})).then(function(){var e=!0,a=!1,i=void 0;try{for(var l,r=o()(t.list);!(e=(l=r.next()).done);e=!0){var n=l.value;if(n.id===t.dataForm.id){var s=t.list.indexOf(n);t.list.splice(s,1,t.dataForm);break}}}catch(t){a=!0,i=t}finally{try{!e&&r.return&&r.return()}finally{if(a)throw i}}t.editDialogFormVisible=!1,t.$notify({title:"成功",message:"更新成功",type:"success",duration:2e3})})})},handleDelete:function(t){var e,a=this;(e=t,Object(n.a)({url:"/product/delete",method:"post",data:e})).then(function(e){a.$notify({title:"成功",message:"删除成功",type:"success",duration:2e3});var i=a.list.indexOf(t);a.list.splice(i,1)})},handleDownload:function(){var t=this;this.downloadLoading=!0,Promise.all([a.e(31),a.e(30)]).then(a.bind(null,"zWO4")).then(function(e){e.export_json_to_excel2(["货品ID","商品ID","商品规格ID列表","货品数量","货品价格","货品图片"],t.list,["id","goodsId","goodsSpecificationIds","goodsNumber","retailPrice","url"],"货品信息"),t.downloadLoading=!1})}}},c={render:function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{staticClass:"app-container calendar-list-container"},[a("div",{staticClass:"filter-container"},[a("el-input",{staticClass:"filter-item",staticStyle:{width:"200px"},attrs:{clearable:"",placeholder:"请输入商品ID"},model:{value:t.listQuery.goodsId,callback:function(e){t.$set(t.listQuery,"goodsId",e)},expression:"listQuery.goodsId"}}),t._v(" "),a("el-button",{directives:[{name:"waves",rawName:"v-waves"}],staticClass:"filter-item",attrs:{type:"primary",icon:"el-icon-search"},on:{click:t.handleFilter}},[t._v("查找")]),t._v(" "),a("el-button",{staticClass:"filter-item",attrs:{type:"primary",icon:"el-icon-edit"},on:{click:t.handleCreate}},[t._v("添加")]),t._v(" "),a("el-button",{directives:[{name:"waves",rawName:"v-waves"}],staticClass:"filter-item",attrs:{type:"primary",icon:"el-icon-download",loading:t.downloadLoading},on:{click:t.handleDownload}},[t._v("导出")])],1),t._v(" "),a("el-table",{directives:[{name:"loading",rawName:"v-loading",value:t.listLoading,expression:"listLoading"}],attrs:{size:"small",data:t.list,"element-loading-text":"正在查询中。。。",border:"",fit:"","highlight-current-row":""}},[a("el-table-column",{attrs:{type:"expand"},scopedSlots:t._u([{key:"default",fn:function(t){}}])}),t._v(" "),a("el-table-column",{attrs:{align:"center",width:"100px",label:"货品ID",prop:"id",sortable:""}}),t._v(" "),a("el-table-column",{attrs:{align:"center","min-width":"100px",label:"商品ID",prop:"goodsId"}}),t._v(" "),a("el-table-column",{attrs:{align:"center","min-width":"150px",label:"商品规格ID列表",prop:"goodsSpecificationIds"},scopedSlots:t._u([{key:"default",fn:function(e){return[t._v("\n          "+t._s(e.row.goodsSpecificationIds.join(","))+"\n        ")]}}])}),t._v(" "),a("el-table-column",{attrs:{align:"center","min-width":"100px",label:"货品数量",prop:"goodsNumber"}}),t._v(" "),a("el-table-column",{attrs:{align:"center","min-width":"100px",label:"货品价格",prop:"retailPrice"}}),t._v(" "),a("el-table-column",{attrs:{align:"center","min-width":"200px",label:"货品图片",prop:"url"}}),t._v(" "),a("el-table-column",{attrs:{align:"center",label:"操作",width:"250","class-name":"small-padding fixed-width"},scopedSlots:t._u([{key:"default",fn:function(e){return[a("el-button",{attrs:{type:"primary",size:"mini"},on:{click:function(a){t.handleUpdate(e.row)}}},[t._v("编辑")]),t._v(" "),a("el-button",{attrs:{type:"danger",size:"mini"},on:{click:function(a){t.handleDelete(e.row)}}},[t._v("删除")])]}}])})],1),t._v(" "),a("div",{staticClass:"pagination-container"},[a("el-pagination",{attrs:{background:"","current-page":t.listQuery.page,"page-sizes":[10,20,30,50],"page-size":t.listQuery.limit,layout:"total, sizes, prev, pager, next, jumper",total:t.total},on:{"size-change":t.handleSizeChange,"current-change":t.handleCurrentChange}})],1),t._v(" "),a("el-dialog",{attrs:{title:"添加货品",visible:t.createDialogFormVisible},on:{"update:visible":function(e){t.createDialogFormVisible=e}}},[a("el-form",{ref:"dataForm",staticStyle:{width:"400px","margin-left":"50px"},attrs:{rules:t.rules,model:t.dataForm,"status-icon":"","label-position":"left","label-width":"100px"}},[a("el-form-item",{attrs:{label:"商品ID",prop:"goodsId"}},[a("el-input",{model:{value:t.dataForm.goodsId,callback:function(e){t.$set(t.dataForm,"goodsId",e)},expression:"dataForm.goodsId"}})],1)],1),t._v(" "),a("div",{staticClass:"dialog-footer",attrs:{slot:"footer"},slot:"footer"},[a("el-button",{on:{click:function(e){t.createDialogFormVisible=!1}}},[t._v("取消")]),t._v(" "),a("el-button",{attrs:{type:"primary"},on:{click:t.createData}},[t._v("确定")])],1)],1),t._v(" "),a("el-dialog",{attrs:{title:"修改货品",visible:t.editDialogFormVisible},on:{"update:visible":function(e){t.editDialogFormVisible=e}}},[a("el-form",{ref:"dataForm",staticStyle:{width:"400px","margin-left":"50px"},attrs:{rules:t.rules,model:t.dataForm,"status-icon":"","label-position":"left","label-width":"100px"}},[a("el-form-item",{attrs:{label:"商品ID",prop:"goodsId"}},[a("el-input",{attrs:{disabled:!0},model:{value:t.dataForm.goodsId,callback:function(e){t.$set(t.dataForm,"goodsId",e)},expression:"dataForm.goodsId"}})],1),t._v(" "),a("el-form-item",{attrs:{label:"商品规格ID列表",prop:"goodsSpecificationIds"}},[a("el-input",{attrs:{disabled:!0},model:{value:t.dataForm.goodsSpecificationIds,callback:function(e){t.$set(t.dataForm,"goodsSpecificationIds",e)},expression:"dataForm.goodsSpecificationIds"}})],1),t._v(" "),a("el-form-item",{attrs:{label:"货品数量",prop:"goodsNumber"}},[a("el-input",{model:{value:t.dataForm.goodsNumber,callback:function(e){t.$set(t.dataForm,"goodsNumber",e)},expression:"dataForm.goodsNumber"}})],1),t._v(" "),a("el-form-item",{attrs:{label:"货品价格",prop:"retailPrice"}},[a("el-input",{model:{value:t.dataForm.retailPrice,callback:function(e){t.$set(t.dataForm,"retailPrice",e)},expression:"dataForm.retailPrice"}})],1),t._v(" "),a("el-form-item",{attrs:{label:"货品图片",prop:"url"}},[a("el-input",{model:{value:t.dataForm.url,callback:function(e){t.$set(t.dataForm,"url",e)},expression:"dataForm.url"}}),t._v(" "),a("el-upload",{attrs:{action:"#","list-type":"picture","show-file-list":!1,limit:1,"http-request":t.uploadUrl}},[a("el-button",{attrs:{size:"small",type:"primary"}},[t._v("点击上传")])],1)],1)],1),t._v(" "),a("div",{staticClass:"dialog-footer",attrs:{slot:"footer"},slot:"footer"},[a("el-button",{on:{click:function(e){t.editDialogFormVisible=!1}}},[t._v("取消")]),t._v("\n\\        "),a("el-button",{attrs:{type:"primary"},on:{click:t.updateData}},[t._v("确定")])],1)],1)],1)},staticRenderFns:[]};var u=a("VU/8")(d,c,!1,function(t){a("S0YP")},null,null);e.default=u.exports},S0YP:function(t,e,a){var i=a("URoO");"string"==typeof i&&(i=[[t.i,i,""]]),i.locals&&(t.exports=i.locals);a("rjj0")("6a3eec8a",i,!0)},URoO:function(t,e,a){(t.exports=a("FZ+f")(!1)).push([t.i,"\n.demo-table-expand {\n  font-size: 0;\n}\n.demo-table-expand label {\n  width: 200px;\n  color: #99a9bf;\n}\n.demo-table-expand .el-form-item {\n  margin-right: 0;\n  margin-bottom: 0;\n}\n",""])}});