package system;

import aQute.bnd.annotation.component.Component;
import aQute.bnd.annotation.component.Reference;

import com.mendix.core.actionmanagement.IActionRegistrator;

@Component(immediate = true)
public class UserActionsRegistrar
{
  @Reference
  public void registerActions(IActionRegistrator registrator)
  {
    registrator.bundleComponentLoaded();
    registrator.registerUserAction(com.mendix.communitycommons.actions.Base64Decode.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.Base64DecodeToFile.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.Base64Encode.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.Base64EncodeFile.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.Clone.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.commitInSeparateDatabaseTransaction.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.commitWithoutEvents.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.copyAttributes.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.CreateLogNode.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.DateTimeToLong.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.DecryptString.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.DeepClone.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.Delay.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.deleteAll.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.DuplicateFileDocument.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.DuplicateImageDocument.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.encryptMemberIfChanged.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.EncryptString.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.EndTransaction.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.EscapeHTML.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.executeMicroflowAsUser.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.executeMicroflowAsUser_1.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.executeMicroflowAsUser_2.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.executeMicroflowInBackground.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.executeMicroflowInBatches.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.executeUnverifiedMicroflowAsUser.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.executeUnverifiedMicroflowAsUser_1.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.executeUnverifiedMicroflowAsUser_2.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.executeUnverifiedMicroflowInBackground.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.executeUnverifiedMicroflowInBatches.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.FileDocumentFromFile.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.FileFromFileDocument.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.GenerateHMAC_SHA256_hash.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.GetApplicationUrl.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.getCreatedByUser.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.GetDefaultLanguage.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.GetFileContentsFromResource.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.getFileSize.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.getGUID.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.GetImageDimensions.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.GetIntFromDateTime.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.getLastChangedByUser.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.getOriginalValueAsString.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.GetRuntimeVersion.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.getTypeAsString.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.Hash.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.HTMLEncode.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.HTMLToPlainText.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.IsInDevelopment.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.Log.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.LongToDateTime.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.memberHasChanged.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.MergeMultiplePdfs.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.MonthsBetween.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.objectHasChanged.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.objectIsNew.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.OverlayPdfDocument.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.ParseDateTimeWithTimezone.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.RandomHash.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.RandomString.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.RandomStrongPassword.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.recommitInBatches.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.refreshClass.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.refreshClassByObject.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.RegexQuote.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.RegexReplaceAll.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.RegexTest.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.retrieveURL.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.RunMicroflowAsyncInQueue.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.SimpleLog.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.StartTransaction.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.storeURLToFileDocument.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.StringFromFile.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.StringLeftPad.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.StringLength.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.StringRightPad.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.StringSplit.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.StringToFile.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.StringTrim.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.SubstituteTemplate.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.SubstituteTemplate2.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.SubstringAfter.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.SubstringAfterLast.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.SubstringBefore.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.SubstringBeforeLast.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.ThrowException.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.ThrowWebserviceException.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.TimeMeasureEnd.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.TimeMeasureStart.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.XSSSanitize.class);
    registrator.registerUserAction(com.mendix.communitycommons.actions.YearsBetween.class);
    registrator.registerUserAction(system.actions.VerifyPassword.class);
  }
}
